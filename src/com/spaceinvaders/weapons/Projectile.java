/*
 * Class :      Projectile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.Character;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;





/**
 * <h1>Projectile</h1>
 * <p>
 * public class Projectile<br/>
 * implements commons
 * </p>
 *
 * @author Constantin MASSON
 */
public abstract class Projectile implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    public      int         posX;
    public      int         posY;
    protected   int         width;
    protected   int         height;
    protected   Image       img;
    protected   boolean     isActive;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    protected Projectile(int pX, int pY, int pWidth, int pHeight){
        this.img    = null;
        this.posX   = pX;
        this.posY   = pY;
        this.width  = pWidth;
        this.height = pHeight;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Move the projectile
     */
    public abstract void move();
    
    
    /**
     * Check if projectile hits something
     * @param pList
     * @return return the object hit, null if nothing
     */
    public abstract Character hits(ArrayList<Character> pList);
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Get the image
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
     * Check if current projectile is active
     * @return true if active, otherwise, return false
     */
    public boolean isActive(){
        return this.isActive;
    }
}
