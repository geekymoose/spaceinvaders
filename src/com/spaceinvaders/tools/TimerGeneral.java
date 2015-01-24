/*
 * Class :      TimeAlien
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.models.ModelGame;
import java.awt.event.ActionEvent;
import javax.swing.Timer;





/**
 * <h1>TimerGeneral</h1>
 * <p>
 * public class TimerGeneral
 * </p>
 * 
 * <p>
 * This class manage the time for the map (General time: frequency of repaint)
 * </p>
 *
 * @author Constantin MASSON
 */
public class TimerGeneral extends TimerManager{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ModelGame   model;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public TimerGeneral(ModelGame pModel){
        super(DELAY_GENERAL);
        this.model   = pModel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        this.model.notifyObservers();
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
