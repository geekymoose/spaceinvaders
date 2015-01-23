/*
 * Class :      MovePlayer
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Player;
import java.awt.Point;





/**
 * <h1>MovePlayer</h1>
 * <p>public class MovePlayer</p>
 *
 * @author Constantin MASSON
 */
public class MovePlayer implements MoveType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Player    player;
    private     int             dx; //See interface Movement for values
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new playerMovement
     * @param pPlayer character using this moveType instance 
     */
    public MovePlayer(Player pPlayer){
        this.player     = pPlayer;
        this.dx         = 0;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        //Add dx at the current x position
        Point newCenter = new Point(this.player.getCenter().x + dx,
                                    this.player.getCenter().y);
        this.player.setCenter(newCenter);
    }
    
    @Override
    public void moveDirection(int direction){
        this.dx = direction;
    }
    
    @Override
    public void stopMove(){
        this.dx = MOVE_STOP;
    }
}