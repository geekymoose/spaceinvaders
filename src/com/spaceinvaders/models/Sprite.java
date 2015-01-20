/*
 * Class :      Sprite
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveType;
import com.spaceinvaders.behaviors.ShootType;
import com.spaceinvaders.constants.Commons;
import java.awt.Image;
import java.awt.Rectangle;





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
public abstract class Sprite implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    protected   MoveType        moveType;
    protected   ShootType       shootType;
    
    protected   boolean         isAlive;
    private     int             posX;
    private     int             posY;
    protected   int             width;
    protected   int             height;
    protected   Image           img;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public Sprite(int pX, int pY, int pWidth, int pHeight){
        this.isAlive    = true;
        this.img        = null;
        this.posX       = pX;
        this.posY       = pY;
        this.width      = pWidth;
        this.height     = pHeight;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Kill this character! :p
     */
    public void die(){
        this.isAlive = false;
    }
    
    /**
     * Perform a move
     * @param direction
     */
    public void move(int direction){
        moveType.move(direction);
    }
    
    /**
     * Perform one shoot
     */
    public void shoot(){
        shootType.fire();
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * get image to display for this Sprite
     * @return 
     */
    public Image getImage(){
        return this.img;
    }
    
    /**
     * Get the position x
     * @return 
     */
    public int getPosX(){
        return this.posX;
    }
    
    /**
     * Get the position y
     * @return 
     */
    public int getPosY(){
        return this.posY;
    }
    
    /**
     * Check if is alive
     * @return true if alive, otherwise, return false
     */
    public boolean isAlive(){
        return this.isAlive; 
    }
    
    /**
     * Return the projectile bounds
     * @return Rectangle
     */
    public Rectangle getBounds(){
        return new Rectangle(posX, posY, width, height);
    }
}
