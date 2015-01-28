/*
 * Class :      ViewTopPanel
 * Creation:    Jan 24, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;





/**
 * <h1>ViewTopPanel</h1>
 * <p>
 public class ViewTopPanel<br/>
 * extends JPanel
 * </p>
 * <p>Top bar with the current player lives and score
 *
 * @author Constantin MASSON
 */
public class ViewTopPanel extends JPanel implements Commons, ObserverGame{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JLabel                  labelScore;
    private     JLabel                  labelScoreValue;
    private     JPanel                  panelNbLivesValue;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create the top bar view
     * This bar display the score and player lives
     */
    public ViewTopPanel(){
        this.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());
        this.initLabels();
    }
    
    /**
     * Initialize the labels
     */
    private void initLabels(){
        this.labelScore         = new JLabel("Score: ");
        this.labelScoreValue    = new JLabel("0");
        this.panelNbLivesValue  = new JPanel();
        
        this.labelScore         .setHorizontalAlignment(JLabel.LEFT);
        this.labelScoreValue    .setHorizontalAlignment(JLabel.LEFT);
        
        Font fontScore              = new Font( Font.SERIF,
                                                Font.BOLD,
                                                TOP_LABEL_FONT_SIZE);
        this.labelScore         .setFont(fontScore);
        this.labelScoreValue    .setFont(fontScore);
        
        this.add(labelScore);
        this.add(labelScoreValue);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void updateInitMap(ObservableGame obs){
        this.labelScore             .setForeground(Color.GRAY);
        this.labelScoreValue        .setForeground(Color.GRAY);
        this.labelScoreValue.setText("0");
    }
    
    @Override
    public void update(ObservableGame obs){
        ModelGame m = ((ModelGame)obs);
        this.labelScore             .setForeground(Color.WHITE);
        this.labelScoreValue        .setForeground(Color.WHITE);
        this.labelScoreValue.setText(String.valueOf(m.getScore()));
    }
}
