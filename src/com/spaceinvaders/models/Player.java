/*
 * Class :      Player
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MovePlayer;
import com.spaceinvaders.behaviors.ShootMissile;
import java.awt.Point;
import javax.swing.ImageIcon;





/**
 * <h1>Player</h1>
 * <p>
 public class Player<br/>
 extends Living
 </p>
 *
 * @author Constantin MASSON
 */
public class Player extends Living{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     int             nbLife;
    private     final Point     barrel;//Extremity canon position from the Player center
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Player at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Player(int pX, int pY){
        super(pX, pY);
        this.barrel         = new Point(0, -(PLAYER_HEIGHT/2));
        ImageIcon i         = new ImageIcon(PATH_PLAYER_IMG);
        this.img            = i.getImage();
        this.shootType      = new ShootMissile(((Living)this), barrel, 1); //Ammo = 1
        this.moveType       = new MovePlayer(this);
        this.width          = PLAYER_WIDTH;
        this.height         = PLAYER_HEIGHT;
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
