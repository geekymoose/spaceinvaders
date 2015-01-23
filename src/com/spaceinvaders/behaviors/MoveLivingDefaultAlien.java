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
    private     int             direction;
    
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new Alien movement
     * @param pCharacter 
     */
    public MoveLivingDefaultAlien(Living pCharacter){
        this.alien      = pCharacter;
        this.direction  = MOVE_RIGHT;
        this.dx         = ALIEN_SPEED;
        this.dy         = 0;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        //Add dx at the current x position
        Point newCenter = new Point(this.alien.getCenter().x + (direction*dx),
                                    this.alien.getCenter().y + dy);
        this.alien.setCenter(newCenter);
    }
    
    @Override
    public void moveDirection(int pDirection){
        if(pDirection == MOVE_OPPOSITE){
            this.direction  *= -1;
            this.dy = ALIEN_DOWN_SPEED;
        }
        else{
            this.dy = 0;
        }
    }
    
    @Override
    public void stopMove(){
        this.dx = MOVE_STOP;
        this.dy = MOVE_STOP;
    }
}
