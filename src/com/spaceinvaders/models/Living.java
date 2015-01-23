/*
 * Class :      Living
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveLivingType;
import com.spaceinvaders.behaviors.ShootType;
import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.observers.ObservableCharacter;
import com.spaceinvaders.observers.ObserverCharacter;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;





/**
 * <h1>Living</h1>
 * <p>
 public abstract class Living<br/>
 * implements observableCharacter
 * </p>
 * 
 * <p>
 * Data for all characters
 * </p>
 *
 * @author Constantin MASSON
 */
public abstract class Living implements Commons, ObservableCharacter{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ArrayList<ObserverCharacter>    listObservers;
    protected   MoveLivingType                        moveType;
    protected   ShootType                       shootType;
    
    protected   boolean                         isAlive;
    protected   int                             posX;
    protected   int                             posY;
    protected   int                             width;
    protected   int                             height;
    protected   Image                           img;
    protected   int                             nbShootActive;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new character at the position x, y (x:y is the center coordinates)
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Living(int pX, int pY){
        this.listObservers      = new ArrayList();
        this.isAlive            = true;
        this.img                = null;
        this.posX               = pX;
        this.posY               = pY;
        this.width              = 0;
        this.height             = 0;
        this.nbShootActive      = 0;
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
     * Check if is alive
     * @return true if alive, otherwise, return false
     */
    public boolean isAlive(){
        return this.isAlive; 
    }
    
    
    
    
    

    //**************************************************************************
    // Functions MoveLivingType
    //**************************************************************************
    /**
     * Perform a move
     */
    public void move(){
        moveType.move();
        this.notifyObservers();
    }
    
    /**
     * Change the movement direction
     * @param direction 
     */
    public void moveDirection(int direction){
        moveType.moveDirection(direction);
    }
    
    /**
     * Stop moving
     */
    public void stopMoving(){
        moveType.stopMove();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions ShootType
    //**************************************************************************
    /**
     * Perform one shoot
     * @param world Where to perform the shoot
     */
    public void fire(ModelGame world){
        shootType.fire(world);
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * get image to display for this Living
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
    
    
    
    
    

    //**************************************************************************
    // Observers
    //**************************************************************************
    @Override
    public void addObserver(ObserverCharacter obs){
        this.listObservers.add(obs);
    }

    @Override
    public void deleteAllObservers(){
        this.listObservers = new ArrayList();
    }
    
    @Override
    public void notifyObservers(){
        for(ObserverCharacter obs : this.listObservers){
            obs.update(this);
        }
    }
}
