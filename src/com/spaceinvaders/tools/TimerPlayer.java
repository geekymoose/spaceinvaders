/*
 * Class :      TimerPlayer
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;





/**
 * <h1>TimerPlayer</h1>
 * <p>public class TimerPlayer</p>
 * <p>Timer for the player actions</p>
 *
 * @author Constantin MASSON
 */
public class TimerPlayer implements ActionListener, Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Timer   timer;
    private     Player  player;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public TimerPlayer(Player pPlayer){
        this.player     = pPlayer;
        this.timer      = new Timer(DELAY_PLAYER, this);
        this.timer.start();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        this.player.move();
    }
}
