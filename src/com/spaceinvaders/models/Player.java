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
        super(pX, pY);
        ImageIcon i         = new ImageIcon(PATH_PLAYER_IMG);
        this.img            = i.getImage();
        this.shootType      = new ShootMissile(((Living)this), 1); //Ammo = 1
        this.moveType       = new MovePlayer(this);
        this.width          = PLAYER_WIDTH;
        this.height         = PLAYER_HEIGHT;
        this.barrel         = new Point(this.posX+PLAYER_WIDTH/2, this.posY+0);
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
