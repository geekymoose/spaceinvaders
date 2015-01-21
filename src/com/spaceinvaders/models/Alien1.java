/*
 * Class :      Alien1
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootLaser;
import javax.swing.ImageIcon;





/**
 * <h1>Alien1</h1>
 * <p>
 public class Alien1<br/>
 extends Character
 </p>
 *
 * @author Constantin MASSON
 */
public class Alien1 extends Character{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 1) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien1(int pX, int pY){
        super(pX, pY, ALIEN1_WIDTH, ALIEN1_HEIGHT);
        ImageIcon i    = new ImageIcon(PATH_ALIEN1_IMG);
        this.img    = i.getImage();
        this.shootType  = new ShootLaser();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
