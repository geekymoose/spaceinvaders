/*
 * Class :      Projectile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.Sprite;
import java.awt.Image;
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
    public      int         x;
    public      int         y;
    protected   int         width;
    protected   int         height;
    protected   Image       img;
    protected   boolean     isActive;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    protected Projectile(int pX, int pY, int pWidth, int pHeight){
        this.img    = null;
        this.x      = pX;
        this.y      = pY;
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
    public abstract Sprite hits(ArrayList<Sprite> pList);
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Return the projectile bounds
     * @return Rectangle
     */
    public Rectangle getBounds(){
        return new Rectangle(x, y, width, height);
    }
    
    /**
     * Check if current projectile is active
     * @return true if active, otherwise, return false
     */
    public boolean isActive(){
        return this.isActive;
    }
}
