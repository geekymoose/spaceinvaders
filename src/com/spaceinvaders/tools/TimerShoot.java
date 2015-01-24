/*
 * Class :      TimerShoot
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.weapons.Projectile;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;





/**
 * <h1>TimerShoot</h1>
 * <p>
 * public class TimerShoot<br/>
 * implements ActionListener, Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class TimerShoot implements ActionListener, Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Timer                       timer;
    private     ArrayList<Projectile>       listAlienShoots;
    private     ArrayList<Projectile>       listPlayerShoots;
    private     ManagerCollision            managerCollision;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a timer for the shoot animations
     * @param pAlien
     * @param pPlayer 
     */
    public TimerShoot(ArrayList<Projectile> pAlien, ArrayList<Projectile> pPlayer){
        this.listAlienShoots    = pAlien;
        this.listPlayerShoots   = pPlayer;
        this.timer              = new Timer(DELAY_SHOOT, this);
        this.timer.start();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        for(int k=0; k<this.listAlienShoots.size(); k++){
            this.listAlienShoots.get(k).move();
        }
        
        for(int k=0; k<this.listPlayerShoots.size(); k++){
            this.listPlayerShoots.get(k).move();
        }
    }
}
