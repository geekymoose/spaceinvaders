/*
 * Class :      Explosion
 * Creation:    Jan 25, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.models.ModelGame;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;





/**
 * <h1>Explosion</h1>
 * <p>
 * public abstract class Explosion<br/>
 * extends TimerManager
 * </p>
 * 
 * <p>Manage the explosion animation<p/>
 *
 * @author Constantin MASSON
 */
public abstract class Explosion extends TimerManager{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    protected   ModelGame           model;
    protected   ArrayList<Image>    listImg;
    protected   Image               img;
    protected   int                 currentPosition; //Position in ArrayList
    
    protected   int                 posX;
    protected   int                 posY;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new explosion
     * @param pPosition explosion center
     * @param pDelay
     * @param pModel model map where explosion is 
     */
    public Explosion(Point pPosition, int pDelay, ModelGame pModel){
        super(pDelay);
        this.listImg            = new ArrayList();
        this.model              = pModel;
        this.posX               = pPosition.x;
        this.posY               = pPosition.y;
        this.currentPosition    = 0;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        if(this.currentPosition==this.listImg.size()){
            this.model.removeExplosion(this);
            this.stopTimer();
        }
        else{
            this.img = this.listImg.get(this.currentPosition);
            this.currentPosition++;
        }
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
        //return new Point(this.posX-(this.width/2), this.posY-(this.height/2));
        int w   = this.img.getWidth(null);
        int h   = this.img.getHeight(null);
        return new Point(this.posX-(w/2), this.posY-(h/2));
    }
}
