/*
 * Class :      ViewGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.controllers.ControllerGame;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.models.Player;
import com.spaceinvaders.models.Sprite;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverGame;
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
public class ViewGame extends JPanel implements Commons, ObserverGame{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ControllerGame          controller;
    private     JPanel                  panGame;
    
    private     ArrayList<Sprite>       listAlien;
    private     ArrayList<Projectile>   listPlayerShoot;
    private     ArrayList<Projectile>   listAlienShoot;
    private     Player                  player;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create the View for game
     * @param pController 
     */
    public ViewGame(ControllerGame pController){
        this.controller         = pController;
        this.player             = new Player(0,0);
        this.listPlayerShoot    = new ArrayList();
        this.listAlien          = new ArrayList();
        this.listAlienShoot     = new ArrayList();
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);
        this.setPreferredSize(DIM_GAME);
    }
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        //Draw the player and the ground
        g2d.drawImage(player.getImage(), player.getPosX(), player.getPosY(), this);
        g2d.setColor(Color.red);
        g2d.drawLine(0, GROUND, GAME_WIDTH, GROUND);
        
        //Draw the aliens
        for(Sprite o : this.listAlien){
            g2d.drawImage(o.getImage(), o.getPosX(), o.getPosY(), this);
        }
        
        //Draw the alien shoots
        for(Projectile p : this.listAlienShoot){
            g2d.drawImage(p.getImage(), p.getPosX(), p.getPosY(), this);
        }
        
        //Draw the player shoots
        for(Projectile p : this.listPlayerShoot){
            g2d.drawImage(p.getImage(), p.getPosX(), p.getPosY(), this);
        }
        
        //See doc: used for synchronisation
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    
    @Override
    public void update(ObservableGame obs){
        ModelGame m = ((ModelGame)obs);
        this.listAlien          = m.getListAliens();
        this.listAlienShoot     = m.getAlienShoot();
        this.listPlayerShoot    = m.getPlayerShoot();
        this.player             = m.getPlayer();
        this.repaint();
    }
}
