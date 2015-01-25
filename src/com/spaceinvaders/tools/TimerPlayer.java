/*
 * Class :      TimerPlayer
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.models.Player;
import java.awt.event.ActionEvent;





/**
 * <h1>TimerPlayer</h1>
 * <p>
 * public class TimerPlayer
 * </p>
 * <p>Timer for the player actions</p>
 *
 * @author Constantin MASSON
 */
public class TimerPlayer extends TimerManager{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Player  player;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public TimerPlayer(Player pPlayer){
        super(DELAY_PLAYER);
        this.player     = pPlayer;
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
