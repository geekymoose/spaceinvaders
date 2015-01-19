/*
 * Class :      Sprite
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveType;
import com.spaceinvaders.behaviors.ShootType;
import java.awt.Image;





/**
 * <h1>Sprite</h1>
 * <p>public abstract class Sprite</p>
 * 
 * <p>
 * Data for all characters
 * </p>
 *
 * @author Constantin MASSON
 */
public abstract class Sprite {
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    protected   MoveType        moveType;
    protected   ShootType       shootType;
    
    protected   boolean         isAlive;
    protected   Image           img;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public Sprite(){
        this.isAlive    = true;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    public void die(){
        this.isAlive = false;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    public boolean getIsAlive(){ return this.isAlive; }
}
