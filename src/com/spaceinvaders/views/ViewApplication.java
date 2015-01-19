/*
 * Class :      ViewApplication
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;





/**
 * <h1>ViewApplication</h1>
 * <p>
 public class ViewApplication<br/>
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
    private     JPanel                  panTop;
    private     JPanel                  panLeft;
    private     JPanel                  panCenter;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Start the application
     * Create the JPanel and initialize the listener
     * Also call for toolBar function and left Panel creation
     */
    public ViewApplication(){
        this.setTitle("Mini games launcher");
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setMinimumSize(DIM_FRAME_MIN);
        this.setAlwaysOnTop(false);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        this.initComponents();
    }
    
    
    /*
     * Initialize JPanel components
     */
    private void initComponents(){
        this.mainContent    = new JPanel();
        this.panTop         = new ViewToolsBar();
        this.panLeft        = new ViewLeftPanel();
        this.panCenter      = new ViewGame();
        
        this.mainContent.setLayout(new BorderLayout());
        this.mainContent.setBackground(Color.BLACK);
        
        this.mainContent.add(this.panTop, BorderLayout.NORTH);
        this.mainContent.add(this.panLeft, BorderLayout.WEST);
        this.mainContent.add(this.panCenter, BorderLayout.CENTER);
        
        this.setContentPane(this.mainContent);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
