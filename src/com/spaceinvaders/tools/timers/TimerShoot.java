/*
 * Class :      TimerShoot
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.timers;

import com.spaceinvaders.tools.ManagerCollision;
import com.spaceinvaders.weapons.Projectile;
import java.awt.event.ActionEvent;
import java.util.ArrayList;





/**
 * <h1>TimerShoot</h1>
 * <p>
 * public class TimerShoot
 * </p>
 *
 * @author Constantin MASSON
 */
public class TimerShoot extends TimerManager{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
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
     * @param pManagerCollision 
     */
    public TimerShoot(ArrayList<Projectile> pAlien, 
                      ArrayList<Projectile> pPlayer,
                      ManagerCollision pManagerCollision){
        super(DELAY_SHOOT);
        this.listAlienShoots    = pAlien;
        this.listPlayerShoots   = pPlayer;
        this.managerCollision   = pManagerCollision;
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
        this.managerCollision.processCollision();
    }
}
