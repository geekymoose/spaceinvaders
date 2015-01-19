/*
 * Class :      Alien1
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootLaser;





/**
 * <h1>Alien1</h1>
 * <p>
 public class Alien1<br/>
 extends Sprite
 </p>
 *
 * @author Constantin MASSON
 */
public class Alien1 extends Sprite{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 1) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien1(int pX, int pY){
        super(pX, pY, ALIEN_WIDTH, ALIEN_HEIGHT);
        this.shootType  = new ShootLaser();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
