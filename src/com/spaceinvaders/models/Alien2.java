/*
 * Class :      Alien2
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveLivingDefaultAlien;
import com.spaceinvaders.behaviors.ShootBomb;
import java.awt.Point;
import javax.swing.ImageIcon;





/**
 * <h1>Alien2</h1>
 * <p>
 public class Alien2<br/>
 extends Alien
 </p>
 *
 * @author Constantin MASSON
 */
public class Alien2 extends Alien{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Point     barrel;//Extremity canon position from the Player center
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 2) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien2(int pX, int pY){
        super(pX, pY, SCORE_VALUE_ALIEN2);
        this.barrel    = new Point(0, ALIEN2_HEIGHT/2);
        this.shootType  = new ShootBomb(this, barrel, 1);
        this.moveType   = new MoveLivingDefaultAlien(this);
        this.width      = ALIEN2_WIDTH;
        this.height     = ALIEN2_HEIGHT;
        
        ImageIcon i     = new ImageIcon(PATH_ALIENS_IMG+"alien2_pos1.png");
        ImageIcon ii    = new ImageIcon(PATH_ALIENS_IMG+"alien2_pos2.png");
        this.img1       = i.getImage();
        this.img2       = ii.getImage();
        this.img        = img1;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
