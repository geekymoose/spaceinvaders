/*
 * Class :      ViewLeftPanel
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.views;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;





/**
 * <h1>ViewLeftPanel</h1>
 * <p>public class ViewLeftPanel</p>
 * 
 * <p>
 * This left panel display data about the current game like score
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewLeftPanel extends JPanel{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JLabel                  labelScore;
    private     JLabel                  labelScoreValue;
    private     JLabel                  labelNbInvaders;
    private     JLabel                  labelNbInvadersValue;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /*
     * Initialize the leftPanel
     */
    public ViewLeftPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(20,20,20));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        this.initLabels();
    }
    
    
    /*
     * Initialize the leftPanel
     */
    private void initLabels(){
        this.labelScore             = new JLabel("Score");
        this.labelScoreValue        = new JLabel("0");
        this.labelNbInvaders        = new JLabel("Remaining Invaders");
        this.labelNbInvadersValue   = new JLabel("0");
        
        this.labelScore             .setHorizontalAlignment(JLabel.CENTER);
        this.labelScoreValue        .setHorizontalAlignment(JLabel.CENTER);
        this.labelNbInvaders        .setHorizontalAlignment(JLabel.CENTER);
        this.labelNbInvadersValue   .setHorizontalAlignment(JLabel.CENTER);
        
        //laps.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,FONT_COUNTERS_SIZE));
        
        this.add(labelScore);
        this.add(labelScoreValue);
        this.add(labelNbInvaders);
        this.add(labelNbInvadersValue);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
