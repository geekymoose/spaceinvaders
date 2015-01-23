/*
 * Class :      ControllerGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.controllers;

import com.spaceinvaders.models.ModelGame;





/**
 * <h1>ControllerGame</h1>
 * <p>public class ControllerGame</p>
 *
 * <p>Controller for the game</p>
 * 
 * @author Constantin MASSON
 */
public class ControllerGame {
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ModelGame   model;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public ControllerGame(ModelGame pModel){
        this.model  = pModel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /*
     * This function is.. ugly, it shouldn't be done like this 
     * (Used for the controller player)
     */
    /**
     * Get the model
     * @return 
     */
    public ModelGame getModelGame(){
        return this.model;
    }
}
