/*
 * Class :      Character
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveType;
import com.spaceinvaders.behaviors.ShootType;
import com.spaceinvaders.constants.Commons;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;





/**
 * <h1>Character</h1>
 * <p>public abstract class Character</p>
 * 
 * <p>
 * Data for all characters
 * </p>
 *
 * @author Constantin MASSON
 */
public abstract class Character implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    protected   MoveType        moveType;
    protected   ShootType       shootType;
    
    protected   boolean         isAlive;
    protected   int             posX;
    protected   int             posY;
    protected   int             width;
    protected   int             height;
    protected   Image           img;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new character at the position x, y (x:y is the center coordinates)
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Character(int pX, int pY){
        this.isAlive    = true;
        this.img        = null;
        this.posX       = pX;
        this.posY       = pY;
        this.width      = 0;
        this.height     = 0;
    }
    
    /**
     * Create a new character at the position x, y (x:y is the center coordinates)
     * @param pX x center coordinates
     * @param pY y center coordinates
     * @param pWidth
     * @param pHeight 
     */
    public Character(int pX, int pY, int pWidth, int pHeight){
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
     * @param e
     */
    public void move(KeyEvent e){
        moveType.move();
    }
    
    /**
     * Perform one shoot
     */
    public void shoot(){
        shootType.fire();
    }
    
    /**
     * Check if is alive
     * @return true if alive, otherwise, return false
     */
    public boolean isAlive(){
        return this.isAlive; 
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * get image to display for this Character
     * @return 
     */
    public Image getImage(){
        return this.img;
    }
    
    /**
     * Get the center position Point
     * @return Point center
     */
    public Point getCenter(){
        return new Point(this.posX, this.posY);
    }
    
    /**
     * Get the Upper left corner position Point of the character
     * @return Point
     */
    public Point getUpperLeftCorner(){
        return new Point(this.posX-(this.width/2), this.posY-(this.height/2));
    }
    
    /**
     * Return the character bounds
     * @return Rectangle
     */
    public Rectangle getBounds(){
        return new Rectangle(this.getUpperLeftCorner(), new Dimension(width, height));
    }
    
    /**
     * Set a new center
     * @param pCenter 
     */
    public void setCenter(Point pCenter){
        this.posX   = pCenter.x;
        this.posY   = pCenter.y;
    }
}
