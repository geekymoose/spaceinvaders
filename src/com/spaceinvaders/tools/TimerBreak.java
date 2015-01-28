/*
 * Class :      TimerBreak
 * Creation:    Jan 28, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.models.ModelGame;
import java.awt.event.ActionEvent;





/**
 * <h1>TimerBreak</h1>
 * <p>
 * public class TimerBreak<br/>
 * extends TimerManager
 * </p>
 * 
 * <p>Create a break</p>
 *
 * @author Constantin MASSON
 */
public class TimerBreak extends TimerManager{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ModelGame   model;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a break timer
     * @param pModel 
     */
    public TimerBreak(ModelGame pModel){
        super(DELAY_BREAK);
        this.model = pModel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Process a break
     */
    public void makeBreak(){
        this.model.stopGameTimers();
        this.startTimer();
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        this.model.startGameTimers();
        this.stopTimer(); //Only a break, must be stop at the first actionPerformed
    }
}
