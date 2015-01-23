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
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.models.Player;
import com.spaceinvaders.models.Living;
import com.spaceinvaders.observers.ObservableCharacter;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverCharacter;
import com.spaceinvaders.observers.ObserverGame;
import com.spaceinvaders.tools.ManagerKeyPlayer;
import com.spaceinvaders.tools.TimerAlien;
import com.spaceinvaders.tools.TimerGeneral;
import com.spaceinvaders.tools.TimerPlayer;
import com.spaceinvaders.tools.TimerShoot;
import com.spaceinvaders.weapons.Projectile;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.ArrayList;
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
    private     JPanel                  panGame;
    
    private     TimerPlayer             timerPlayer;
    private     TimerShoot              timerShoot;
    private     TimerAlien              timerAlien;
    private     TimerGeneral            timerGeneral;
    
    private     ArrayList<Alien>        listAlien;
    private     ArrayList<Projectile>   listPlayerShoot;
    private     ArrayList<Projectile>   listAlienShoot;
    private     Player                  player;
    
    
    
    
    

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
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);
        this.setPreferredSize(DIM_GAME);
        this.setFocusable(true);
        this.setDoubleBuffered(true);
    }
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        //Draw the player and the ground
        g2d.drawImage(player.getImage(), player.getUpperLeftCorner().x, player.getUpperLeftCorner().y, this);
        g2d.setColor(Color.red);
        g2d.drawLine(0, GROUND, GAME_WIDTH, GROUND);
        
        //Draw the aliens
        for(Living o : this.listAlien){
            g2d.drawImage(o.getImage(), o.getUpperLeftCorner().x, o.getUpperLeftCorner().y, this);
        }
        
        //Draw the alien shoots
        for(Projectile p : this.listAlienShoot){
            g2d.drawImage(p.getImage(), p.getUpperLeftCorner().x, p.getUpperLeftCorner().y, this);
        }
        
        //Draw the player shoots
        for(Projectile p : this.listPlayerShoot){
            g2d.drawImage(p.getImage(), p.getUpperLeftCorner().x, p.getUpperLeftCorner().y, this);
        }
        
        //See doc: used for synchronisation
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    
    
    
    
    //**************************************************************************
    // Observers
    //**************************************************************************
    @Override
    public void updateInitMap(ObservableGame obs){
        ModelGame m = ((ModelGame)obs);
        this.listAlien          = m.getListAliens();
        this.listAlienShoot     = m.getAlienShoot();
        this.listPlayerShoot    = m.getPlayerShoot();
        this.player             = m.getPlayer();
        
        ControllerPlayer c      = new ControllerPlayer(this.player, this.controller.getModelGame());
        this.keyGameManager     = new ManagerKeyPlayer(c);
        this.addKeyListener(keyGameManager);
        
        //Start timer Player
        this.player.addObserver(this);
        this.timerPlayer        = new TimerPlayer(this.player);
        
        //Start timer shoot
        this.timerShoot         = new TimerShoot(this.listAlienShoot, this.listPlayerShoot);
        
        //Start timer for aliens
        this.timerAlien         = new TimerAlien(this.listAlien);
        
        //Start general Timer
        this.timerGeneral       = new TimerGeneral(this);
    }
    
    
    @Override
    public void update(ObservableGame obs){
        ModelGame m = ((ModelGame)obs);
        this.listAlien          = m.getListAliens();
        this.listAlienShoot     = m.getAlienShoot();
        this.listPlayerShoot    = m.getPlayerShoot();
        this.player.setCenter(m.getPlayer().getCenter());
    }


    @Override
    public void update(ObservableCharacter obs){
        Player p = ((Player)obs);
        this.player             = p;
    }
}
