/*
 * Class :      ViewGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.controllers.ControllerGame;
import com.spaceinvaders.controllers.ControllerPlayer;
import com.spaceinvaders.models.Alien;
import com.spaceinvaders.models.GameModel;
import com.spaceinvaders.models.Player;
import com.spaceinvaders.models.Living;
import com.spaceinvaders.observers.ObservableCharacter;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverCharacter;
import com.spaceinvaders.observers.ObserverGame;
import com.spaceinvaders.tools.events.DynamicEvent;
import com.spaceinvaders.tools.ManagerKeyPlayer;
import com.spaceinvaders.tools.SoundEffect;
import com.spaceinvaders.weapons.Projectile;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;





/**
 * <h1>ViewGame</h1>
 * <p>
 * public class ViewGame<br/>
 * extends JPanel<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewGame extends JPanel implements Commons, 
                                                ObserverGame, 
                                                ObserverCharacter{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ControllerGame          controller;
    private     ManagerKeyPlayer        keyGameManager;
    
    private     ArrayList<Alien>        listAlien;
    private     ArrayList<Projectile>   listPlayerShoot;
    private     ArrayList<Projectile>   listAlienShoot;
    private     ArrayList<DynamicEvent>    listExplosions;
    private     Player                  player;
    
    private     Image                   background;
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create the View for game
     * Create all attribute and set the controllers, size and listener
     * @param pController 
     */
    public ViewGame(ControllerGame pController){
        this.controller         = pController;
        this.player             = null;
        this.listPlayerShoot    = new ArrayList();
        this.listAlien          = new ArrayList();
        this.listAlienShoot     = new ArrayList();
        this.listExplosions     = new ArrayList();
        
        this.setLayout(new BorderLayout());
        this.setPreferredSize(DIM_GAME);
        this.setFocusable(true);
        this.setDoubleBuffered(true);
        this.setBackground(Color.BLACK);
        
        ImageIcon i             = new ImageIcon(IMG_THEME+"background.png");
        this.background         = i.getImage();
        
        /*
         * keyManager manage player movements. Init to null because player has
         * to be created in the model. the observer updateInitMap will add the
         * controller in the keyGameManager (Created here)
         */
        this.keyGameManager     = new ManagerKeyPlayer(null);
        this.addKeyListener(keyGameManager);
    }
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        //Draw the player and the ground
        g2d.drawImage(background, 0, 0, this);
        g2d.drawImage(player.getImage(), player.getUpperLeftCorner().x, player.getUpperLeftCorner().y, this);
        g2d.setColor(Color.red);
        
        drawSubLine(g);
        
        /*
         * Draw aliens
         * Draw alien shoots
         * Draw player shoots
         * Draw explosions
         */
        for(Living o : this.listAlien){
            g2d.drawImage(o.getImage(), o.getUpperLeftCorner().x, o.getUpperLeftCorner().y, this);
        }
        for(Projectile p : this.listAlienShoot){
            g2d.drawImage(p.getImage(), p.getUpperLeftCorner().x, p.getUpperLeftCorner().y, this);
        }
        for(Projectile p : this.listPlayerShoot){
            g2d.drawImage(p.getImage(), p.getUpperLeftCorner().x, p.getUpperLeftCorner().y, this);
        }
        for(DynamicEvent e : this.listExplosions){
            g2d.drawImage(e.getImage(), e.getUpperLeftCorner().x, e.getUpperLeftCorner().y, this);
        }
        
        //See doc: used for synchronisation
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    
    /**
     * Draw the sub line (The ground)
     * @param g 
     */
    private void drawSubLine(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        
        BasicStroke bs1 = new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs1);
        g2d.drawLine(10, GROUND, GAME_WIDTH-10, GROUND); //Ground line
    }
    
    
    
    
    
    //**************************************************************************
    // Observers
    //**************************************************************************
    @Override
    public void updateInitMap(ObservableGame obs){
        GameModel m = ((GameModel)obs);
        this.listAlien          = m.getListAliens();
        this.listAlienShoot     = m.getAlienShoot();
        this.listPlayerShoot    = m.getPlayerShoot();
        this.listExplosions     = m.getListExplosions();
        this.player             = m.getPlayer();
        
        ControllerPlayer c      = new ControllerPlayer( this.player, 
                                                        this.controller.getModelGame());
        this.keyGameManager.setController(c);
        this.player.addObserver(this);
        this.repaint();
        this.requestFocusInWindow();
        SoundEffect.START.play();
    }
    
    
    @Override
    public void update(ObservableGame obs){
        GameModel m = ((GameModel)obs);
        this.listAlien          = m.getListAliens();
        this.listAlienShoot     = m.getAlienShoot();
        this.listPlayerShoot    = m.getPlayerShoot();
        this.listExplosions     = m.getListExplosions();
        this.player             = m.getPlayer();
        this.repaint();
        this.requestFocusInWindow();
    }


    @Override
    public void update(ObservableCharacter obs){
        Player p = ((Player)obs);
        this.player             = p;
    }
}
