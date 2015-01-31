/*
 * Class :      TimerManager
 * Creation:    Jan 24, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.timers;

import com.spaceinvaders.constants.Commons;
import java.awt.event.ActionListener;
import javax.swing.Timer;





/**
 * <h1>TimerManager</h1>
 * <p>
 public class TimerManager<br/>
 * implements ActionListener, Commons
 * </p>
 * <p>Parent class for every timers</p>
 *
 * @author Constantin MASSON
 */
public abstract class TimerManager implements ActionListener, Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Timer       timer;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public TimerManager(int pDelay){
        this.timer              = new Timer(pDelay, this);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Start the timer
     */
    public void startTimer(){
        this.timer.start();
    }
    
    /**
     * Stop the timer
     */
    public void stopTimer(){
        this.timer.stop();
    }
}
