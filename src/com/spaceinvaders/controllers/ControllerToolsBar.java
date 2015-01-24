/*
 * Class :      ControllerToolsBar
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.controllers;

import com.spaceinvaders.models.ModelGame;





/**
 * <h1>ControllerToolsBar</h1>
 * <p>public class ControllerToolsBar</p>
 * 
 * <p>
 * Manage the action with tools bar buttons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ControllerToolsBar {
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ModelGame   model;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public ControllerToolsBar(ModelGame pModel){
        this.model  = pModel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Order to start the game
     */
    public void startGame(){
        this.model.startTimers();
    }
    
    /**
     * Order to stop the game
     */
    public void stopGame(){
        this.model.stopTimers();
    }
    
    /*
     * Order to restart the game (Reste the current and restart)
     */
    public void restartGame(){
        this.model.stopTimers();
        this.model.initMap();
    }
    
    /**
     * Save the current game
     */
    public void saveGame(){
        
    }
    
    /**
     * Load a old game
     */
    public void loadGame(){
        
    }
}
