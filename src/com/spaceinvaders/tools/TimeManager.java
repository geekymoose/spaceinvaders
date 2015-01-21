/*
 * Class :      TimeManager
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Commons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;





/**
 * <h1>TimeManager</h1>
 * <p>
 * public class TimeManager<br/>
 * implements ActionListener, commons
 * </p>
 * 
 * <p>
 * This class manage the time
 * </p>
 *
 * @author Constantin MASSON
 */
public class TimeManager implements ActionListener, Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Timer   timer;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public TimeManager(){
        this.timer  = new Timer(DELAY, this);
        this.timer.start();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
