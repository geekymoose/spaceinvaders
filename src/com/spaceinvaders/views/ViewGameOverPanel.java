/*
 * Class :      ViewGameOverPanel
 * Creation:    Jan 30, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;





/**
 * <h1>ViewGameOverPanel</h1>
 * <p>
 * public class ViewGameOverPanel<br/>
 * extends JPanel<br/>
 * implements Commons, KeyListener
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewGameOverPanel extends JPanel implements Commons, KeyListener{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Image               background;
    private     Image               title;
    
    private     ViewApplication     parent;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new JPanel for the gameOver
     * @param pParent 
     */
    public ViewGameOverPanel(ViewApplication pParent){
        this.parent     = pParent;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    @Override
    public void keyTyped(KeyEvent e){
    
    }
    
    @Override
    public void keyPressed(KeyEvent e){
    
    }
    
    @Override
    public void keyReleased(KeyEvent e){
    
    }
}
