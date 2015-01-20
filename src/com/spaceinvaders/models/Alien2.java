/*
 * Class :      Alien2
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootBomb;
import javax.swing.ImageIcon;





/**
 * <h1>Alien2</h1>
 * <p>
 public class Alien2<br/>
 extends Sprite
 </p>
 *
 * @author Constantin MASSON
 */
public class Alien2 extends Sprite{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 2) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien2(int pX, int pY){
        super(pX, pY, ALIEN_WIDTH, ALIEN_HEIGHT);
        ImageIcon i    = new ImageIcon(PATH_ALIEN2_IMG);
        this.img    = i.getImage();
        this.shootType  = new ShootBomb();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
