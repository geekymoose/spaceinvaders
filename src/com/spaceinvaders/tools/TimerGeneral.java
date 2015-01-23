/*
 * Class :      TimeAlien
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.views.ViewGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;





/**
 * <h1>TimerGeneral</h1>
 * <p>
 public class TimerGeneral<br/>
 * implements ActionListener, commons
 * </p>
 * 
 * <p>
 * This class manage the time for the map (General time: frequency of repaint)
 * </p>
 *
 * @author Constantin MASSON
 */
public class TimerGeneral implements ActionListener, Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Timer       timer;
    private     ViewGame    view;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public TimerGeneral(ViewGame pView){
        this.view   = pView;
        this.timer  = new Timer(DELAY_GENERAL, this);
        this.timer.start();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        this.view.repaint();
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
