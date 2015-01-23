/*
 * Class :      MoveLivingDefaultAlien
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Living;
import java.awt.Point;





/**
 * <h1>MoveLivingDefaultAlien</h1>
 * <p>public class MoveLivingDefaultAlien</p>
 *
 * @author Constantin MASSON
 */
public class MoveLivingDefaultAlien implements MoveLivingType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Living alien;
    private     int             dx; //See interface Movement for values
    private     int             dy;
    
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new Alien movement
     * @param pCharacter 
     */
    public MoveLivingDefaultAlien(Living pCharacter){
        this.alien      = pCharacter;
        this.dx         = 0;
        this.dy         = 0;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        //Add dx at the current x position
        Point newCenter = new Point(this.alien.getCenter().x + dx,
                                    this.alien.getCenter().y + dy);
        this.alien.setCenter(newCenter);
    }
    
    @Override
    public void moveDirection(int direction){
        if(direction == MOVE_DOWN){
            this.dy = 1;
        }
        else{
            this.dx = direction;
        }
    }
    
    @Override
    public void stopMove(){
        this.dx = MOVE_STOP;
        this.dy = MOVE_STOP;
    }
}
