/*
 * Class :      Alien2
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.ShootBomb;
import static com.spaceinvaders.constants.Commons.ALIEN1_HEIGHT;
import static com.spaceinvaders.constants.Commons.ALIEN1_WIDTH;
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
        super(pX, pY);
        this.barrel    = new Point(0, ALIEN2_HEIGHT/2);
        ImageIcon i     = new ImageIcon(PATH_ALIEN2_IMG);
        this.img        = i.getImage();
        this.shootType  = new ShootBomb(this, barrel, 1);
        this.width      = ALIEN2_WIDTH;
        this.height     = ALIEN2_HEIGHT;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
