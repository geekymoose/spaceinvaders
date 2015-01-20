/*
 * Class :      KeyGameManager
 * Creation:    Jan 20, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Movements;
import com.spaceinvaders.controllers.ControllerGame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;





/**
 * <h1>KeyGameManager</h1>
 * <p>
 public class KeyGameManager<br/>
 * implements KeyListener, Movements
 * </p>
 *
 * @author Constantin MASSON
 */
public class KeyGameManager implements KeyListener, Movements{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ControllerGame  controller;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new KeyGameManager
     * @param pController 
     */
    public KeyGameManager(ControllerGame pController){
        this.controller = pController;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void keyTyped(KeyEvent e){
    }



    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
        }
        
        else if (key == KeyEvent.VK_LEFT) {
            this.controller.movePlayer(MOVE_LEFT);
        }

        else if (key == KeyEvent.VK_RIGHT) {
            this.controller.movePlayer(MOVE_RIGHT);
        }
    }



    @Override
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
        }
        else{
            //Stop moving
        }
    }
}
