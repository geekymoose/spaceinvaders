/*
 * Class :      ControllerPlayer
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.controllers;

import com.spaceinvaders.models.ModelGame;
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
    private     ModelGame   world;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new controller for the player. pWorld is the current player map
     * @param pModel player model
     * @param pWorld Where the player is
     */
    public ControllerPlayer(Player pModel, ModelGame pWorld){
        this.model  = pModel;
        this.world  = pWorld;
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
    public void fire(){
        this.model.fire(world);
    }
}
