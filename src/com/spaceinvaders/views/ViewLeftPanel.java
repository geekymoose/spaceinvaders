/*
 * Class :      ViewLeftPanel
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverGame;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;





/**
 * <h1>ViewLeftPanel</h1>
 * <p>
 public class ViewLeftPanel<br/>
 * implements Commons, ObserverGame
 * </p>
 * 
 * <p>
 * This left panel display data about the current game like score
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewLeftPanel extends JPanel implements Commons, ObserverGame{
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
        this.setLayout(new GridLayout(4,1));
        this.setBackground(new Color(20,20,20));
        this.initLabels();
    }
    
    
    /*
     * Initialize the leftPanel
     */
    private void initLabels(){
        this.labelScore             = new JLabel("Score");
        this.labelScoreValue        = new JLabel("0");
        this.labelNbInvaders        = new JLabel("Invaders");
        this.labelNbInvadersValue   = new JLabel("0");
        
        this.labelScore             .setHorizontalAlignment(JLabel.CENTER);
        this.labelScoreValue        .setHorizontalAlignment(JLabel.CENTER);
        this.labelNbInvaders        .setHorizontalAlignment(JLabel.CENTER);
        this.labelNbInvadersValue   .setHorizontalAlignment(JLabel.CENTER);
        
        Font fontLabel              = new Font( Font.SERIF,
                                                Font.BOLD,
                                                LEFT_LABEL_TITLE_SIZE);
        Font fontNumber             = new Font( Font.SERIF,
                                                Font.BOLD,
                                                LEFT_LABEL_SIZE);
        
        this.labelScore             .setFont(fontLabel);
        this.labelScoreValue        .setFont(fontNumber);
        this.labelNbInvaders        .setFont(fontLabel);
        this.labelNbInvadersValue   .setFont(fontNumber);
        
        this.add(labelScore);
        this.add(labelScoreValue);
        this.add(labelNbInvaders);
        this.add(labelNbInvadersValue);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void updateInitMap(ObservableGame obs){
        this.labelScore             .setForeground(Color.GRAY);
        this.labelScoreValue        .setForeground(Color.GRAY);
        this.labelNbInvaders        .setForeground(Color.GRAY);
        this.labelNbInvadersValue   .setForeground(Color.GRAY);
        this.labelScoreValue.setText("0");
        this.labelNbInvadersValue.setText("0");
    }
    
    @Override
    public void update(ObservableGame obs){
        ModelGame m = ((ModelGame)obs);
        this.labelScore             .setForeground(Color.WHITE);
        this.labelScoreValue        .setForeground(Color.WHITE);
        this.labelNbInvaders        .setForeground(Color.WHITE);
        this.labelNbInvadersValue   .setForeground(Color.WHITE);
        this.labelScoreValue.setText(String.valueOf(m.getScore()));
        this.labelNbInvadersValue.setText(String.valueOf(m.getNbAliens()));
    }
}
