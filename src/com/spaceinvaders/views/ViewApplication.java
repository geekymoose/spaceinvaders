/* 
 * Class :      ViewApplication
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.ModelGame;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 * <h1>ViewApplication</h1>
 * <p>
 * public class ViewApplication<br/>
 * extends JFrame<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewApplication extends JFrame implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JPanel                  mainContent;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Start the application
     * Create the JPanel and initialize the listener
     * Also call for toolBar function and left Panel creation
     */
    public ViewApplication(){
        this.setTitle("Space invaders");
        this.setMinimumSize(DIM_FRAME_MIN); //No resize: not actually useful
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
    }
    
    
    /*
     * Initialize JPanel components used by the program
     */
    private void initComponents(){
        this.mainContent = new ViewWelcomePanel(this);
        this.getContentPane().add(this.mainContent);
    }
    
    
    /**
     * Display the menu page
     */
    public void returnMenu(){
        this.getContentPane().removeAll();
        this.mainContent = new ViewWelcomePanel(this);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * Start the game
     * Close welcome page and display the game one
     */
    public void startGame(){
        this.getContentPane().removeAll();
        this.mainContent = new ViewGamePanel(this);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Display victory panel after closing the current one (The game)
     * @param game Game just finished
     */
    public void displayVictory(ModelGame game){
        this.getContentPane().removeAll();
        this.mainContent = new ViewVictoryPanel(this, game);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
