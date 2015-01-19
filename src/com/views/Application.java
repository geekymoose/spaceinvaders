/*
 * Class :      Application
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.views;

import com.constants.commons;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 * <h1>Application</h1>
 * <p>
 public class Application<br/>
 * extends JFrame
 * </p>
 *
 * @author Constantin MASSON
 */
public class Application extends JFrame implements commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JPanel      panTop;
    private     JPanel      panLeft;
    private     JPanel      panCenter;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Start the application
     */
    public Application(){
        this.setTitle("Mini games launcher");
        this.setAlwaysOnTop(false);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * Initialize JPanel components
     */
    public void initComponents(){
        
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
