/*
 * Class :      ManagerKeyPlayer
 * Creation:    Jan 20, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Movements;
import com.spaceinvaders.controllers.ControllerPlayer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;





/**
 * <h1>ManagerKeyPlayer</h1>
 * <p>
 * public class ManagerKeyPlayer<br/>
 * implements KeyListener, Movements
 * </p>
 * <p>
 * This class is the main manager for all key. When user use a key (Pressed, Typed etc)
 * this manager is called to process this action. (In the game window)
 * </p>
 *
 * @author Constantin MASSON
 */
public class ManagerKeyPlayer implements KeyListener, Movements{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ControllerPlayer    controller;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new KeyGameManager
     * @param pController 
     */
    public ManagerKeyPlayer(ControllerPlayer pController){
        this.controller = pController;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void keyTyped(KeyEvent e){
        //Nothing
    }



    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            this.controller.fire();
        }
        
        if (key == KeyEvent.VK_LEFT) {
            this.controller.changeMoveDirection(MOVE_LEFT);
        }
        
        else if (key == KeyEvent.VK_RIGHT) {
            this.controller.changeMoveDirection(MOVE_RIGHT);
        }
    }



    @Override
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT){
            this.controller.stopMoving();
        }
    }
}
