/*
 * Class :      ControllerPlayer
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.controllers;

import com.spaceinvaders.models.Player;





/**
 * <h1>ControllerPlayer</h1>
 * <p>public class ControllerPlayer</p>
 *
 * @author Constantin MASSON
 */
public class ControllerPlayer {
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Player      model;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public ControllerPlayer(Player pModel){
        this.model  = pModel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Change the player move direction
     * @param direction 
     */
    public void changeMoveDirection(int direction){
        this.model.moveDirection(direction);
    }
    
    /**
     * Stop the movement
     */
    public void stopMoving(){
        this.model.stopMoving();
    }
    
    /**
     * Process a shoot
     */
    public void shoot(){
        this.model.fire();
    }
}
