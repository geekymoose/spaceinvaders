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
    public ViewGame(ControllerGame pController){
        this.controller         = pController;
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        
        //Draw the player
        g2d.drawImage(player.getImage(), player.getPosX(), player.getPosY(), this);
        
        //Draw the aliens
        for(Sprite o : this.listAlien){
            g2d.drawImage(o.getImage(), o.getPosX(), o.getPosY(), this);
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
