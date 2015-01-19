/*
 * Class :      Player
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;





/**
 * <h1>Player</h1>
 * <p>
 public class Player<br/>
 extends Sprite
 </p>
 *
 * @author Constantin MASSON
 */
public class Player extends Sprite{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     int     nbLife;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Player at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    protected Player(int pX, int pY){
        super(pX, pY, PLAYER_WIDTH, PLAYER_HEIGHT);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Earn one more life
     */
    public void earnOneLife(){
        this.nbLife += 1;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    public int getNbLife(){
        return this.nbLife;
    }
}
