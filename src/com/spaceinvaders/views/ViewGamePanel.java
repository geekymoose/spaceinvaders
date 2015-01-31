/*
 * Class :      ViewGamePanel
 * Creation:    Jan 28, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.controllers.ControllerGame;
import com.spaceinvaders.controllers.ControllerToolsBar;
import com.spaceinvaders.models.GameModel;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverGame;
import java.awt.BorderLayout;
import javax.swing.JPanel;





/**
 * <h1>ViewGamePanel</h1>
 * <p>
 public class ViewGamePanel<br/>
 * extends JPanel
 * </p>
 * 
 * <p>This panel will contains the game map and all data displayed about game
 * (Score, number lives)</p>
 *
 * @author Constantin MASSON
 */
public class ViewGamePanel extends JPanel implements ObserverGame{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ViewApplication         parent;
    private     JPanel                  panTools;
    private     JPanel                  panScore;
    private     JPanel                  panCenter;
    
    private     GameModel               game;
    private     ViewToolsBar            tools;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new Game panel which will display the game map and data
     * @param pParent Parent container
     */
    public ViewGamePanel(ViewApplication pParent){
        this.setLayout(new BorderLayout());
        this.parent             = pParent;
        this.initComponents();
    }
    
    /*
     * Initialize the components
     */
    private void initComponents(){
        this.game               = new GameModel();
        ControllerGame      c   = new ControllerGame(this.game);
        ControllerToolsBar  c2  = new ControllerToolsBar(this.game);
        ViewGame            v   = new ViewGame(c);
        ViewScorePanel      v2  = new ViewScorePanel();
        this.tools              = new ViewToolsBar(c2);
        
        this.game.addObserver(v);
        this.game.addObserver(v2);
        this.game.addObserver(this);
        this.game.initMap();
        
        this.panScore           = v2;
        this.panTools           = this.tools;
        this.panCenter          = v;
        
        this.add(this.panTools, BorderLayout.NORTH);
        this.add(this.panCenter, BorderLayout.CENTER);
        this.add(this.panScore, BorderLayout.SOUTH);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    @Override
    public void update(ObservableGame obs){
        GameModel m = ((GameModel)obs);
        if(m.isGameOver()==true){
            this.parent.displayGameOver(this.game);
        }
        else if(m.isVictory()==true){
            this.parent.displayVictory(this.game);
        }
    }



    @Override
    public void updateInitMap(ObservableGame obs){
        //Nothing to do
    }
}
