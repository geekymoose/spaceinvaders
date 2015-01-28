/*
 * Class :      ViewScorePanel
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
 * <h1>ViewScorePanel</h1>
 * <p>
 public class ViewScorePanel<br/>
 * extends JPanel
 * </p>
 * <p>Top bar with the current player lives and score
 *
 * @author Constantin MASSON
 */
public class ViewScorePanel extends JPanel implements Commons, ObserverGame{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JPanel                  panScore;
    private     JPanel                  panLives;
    private     JLabel                  labelScore;
    private     JLabel                  labelScoreValue;
    private     int                     nbLives;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create the top bar view
     * This bar display the score and player lives
     */
    public ViewScorePanel(){
        this.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());
        this.initScoreLabel();
        this.initLivesPanel();
    }
    
    /**
     * Initialize the labels
     */
    private void initScoreLabel(){
        this.panScore           = new JPanel();
        this.labelScore         = new JLabel("Score: ");
        this.labelScoreValue    = new JLabel("0");
        
        this.panScore           .setBackground(Color.BLACK);
        this.labelScore         .setHorizontalAlignment(JLabel.LEFT);
        this.labelScoreValue    .setHorizontalAlignment(JLabel.LEFT);
        
        Font fontScore          = new Font( Font.SERIF,
                                            Font.BOLD,
                                            FONT_SCORE_SIZE);
        this.labelScore         .setFont(fontScore);
        this.labelScoreValue    .setFont(fontScore);
        
        this.panScore.add(labelScore);
        this.panScore.add(labelScoreValue);
        this.add(this.panScore, BorderLayout.WEST);
    }
    
    /**
     * Initialize the lives panel
     */
    private void initLivesPanel(){
        this.panLives           = new JPanel();
        this.panLives           .setBackground(Color.BLACK);
        this.nbLives            = 3;
        this.add(this.panLives, BorderLayout.EAST);
        this.displayLives();
    }
    
    /**
     * Display player lives
     */
    private void displayLives(){
        this.panLives.removeAll();
        for(int k=0; k<this.nbLives; k++){
            this.panLives.add(new ViewImgPlayer());
        }
        this.panLives.validate();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void updateInitMap(ObservableGame obs){
        this.labelScore             .setForeground(Color.GRAY);
        this.labelScoreValue        .setForeground(Color.GRAY);
        this.labelScoreValue.setText("0");
        this.nbLives = 3;
    }
    
    @Override
    public void update(ObservableGame obs){
        ModelGame m = ((ModelGame)obs);
        this.labelScore             .setForeground(Color.WHITE);
        this.labelScoreValue        .setForeground(Color.WHITE);
        this.labelScoreValue.setText(String.valueOf(m.getScore()));
        
        //Update the nb lives displayed
        if(m.getPlayer().getNbLife() != this.nbLives){
            this.nbLives = m.getPlayer().getNbLife();
            this.displayLives();
        }
        this.repaint();
    }
}
