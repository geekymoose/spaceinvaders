/*
 * Class :      Alien1
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootLaser;
import static com.spaceinvaders.constants.Commons.PLAYER_WIDTH;
import java.awt.Point;
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
public class Alien1 extends Alien{
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
        super(pX, pY);
        ImageIcon i     = new ImageIcon(PATH_ALIEN1_IMG);
        this.img        = i.getImage();
        this.shootType  = new ShootLaser(this, 1);
        this.width      = ALIEN1_WIDTH;
        this.height     = ALIEN1_HEIGHT;
        this.barrel         = new Point(ALIEN1_WIDTH/2, ALIEN1_HEIGHT);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
