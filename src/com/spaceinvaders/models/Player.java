/*
 * Class :      Player
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootMissile;
import javax.swing.ImageIcon;





/**
 * <h1>Player</h1>
 * <p>
 public class Player<br/>
 extends Character
 </p>
 *
 * @author Constantin MASSON
 */
public class Player extends Character{
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
    public Player(int pX, int pY){
        super(pX, pY, PLAYER_WIDTH, PLAYER_HEIGHT);
        ImageIcon i    = new ImageIcon(PATH_PLAYER_IMG);
        this.img    = i.getImage();
        this.shootType  = new ShootMissile();
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
