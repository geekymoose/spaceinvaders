/*
 * Class :      Alien3
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootBomb;
import javax.swing.ImageIcon;





/**
 * <h1>Alien3</h1>
 * <p>
 public class Alien3<br/>
 extends Character
 </p>
 *
 * @author Constantin MASSON
 */
public class Alien3 extends Character{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 3) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien3(int pX, int pY){
        super(pX, pY, ALIEN3_WIDTH, ALIEN3_HEIGHT);
        ImageIcon i    = new ImageIcon(PATH_ALIEN3_IMG);
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
