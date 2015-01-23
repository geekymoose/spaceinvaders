/*
 * Class :      Projectile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.behaviors.MoveShootType;
import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.Living;
import com.spaceinvaders.observers.ObserverProjectile;
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
    private     ArrayList<ObserverProjectile>   listObservers;
    protected   int                             posX;
    protected   int                             posY;
    protected   int                             width;
    protected   int                             height;
    protected   Image                           img;
    protected   boolean                         isActive;
    protected   Living                          owner;
    
    protected   MoveShootType                   moveShootType;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new projectile owned by a character (Alien or player)
     * @param pX
     * @param pY
     * @param pWidth
     * @param pHeight
     * @param pOwner 
     */
    protected Projectile(int pX, int pY, int pWidth, int pHeight, Living pOwner){
        this.img            = null;
        this.posX           = pX;
        this.posY           = pY;
        this.width          = pWidth;
        this.height         = pHeight;
        this.owner          = pOwner;
        this.moveShootType  = null;
        this.listObservers  = new ArrayList();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Move the projectile
     */
    public void move(){
        this.moveShootType.move();
    }
    
    
    /**
     * Check if projectile hits something
     * @param pList
     * @return return the object hit, null if nothing
     */
    public abstract Living hits(ArrayList<Living> pList);
    
    /**
     * Check if current projectile is active
     * @return true if active, otherwise, return false
     */
    public boolean isActive(){
        return this.isActive;
    }
    
    
    
    
    

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
     * Get the position x
     * @return 
     */
    public int getPosX(){
        return this.posX;
    }
    
    /**
     * Get the position Y
     * @return 
     */
    public int getPosY(){
        return this.posY;
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
     * Set the center at a new position
     * @param pCenter New position
     */
    public void setCenter(Point pCenter){
        this.posX   = pCenter.x;
        this.posY   = pCenter.y;
    }
}
