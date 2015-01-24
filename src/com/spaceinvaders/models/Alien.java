/*
 * Class :      Alien
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import java.awt.Image;





/**
 * <h1>Alien</h1>
 * <p>
 * public class Alien<br/>
 extends Living
 </p>
 *
 * @author Constantin MASSON
 */
public abstract class Alien extends Living{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    protected   Image   img1;
    protected   Image   img2;
    protected   int     scoreValue;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 1) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     * @param pScoreValue
     */
    public Alien(int pX, int pY, int pScoreValue){
        super(pX, pY);
        this.scoreValue     = pScoreValue;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        if(this.img==this.img1){
            this.img    = this.img2;
        }
        else{
            this.img    = this.img1;
        }
        super.move();
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Get the score value
     */
    public int getScoreValue(){
        return this.scoreValue;
    }
}
