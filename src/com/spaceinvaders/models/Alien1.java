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
    private     final Point     barrel;//Extremity canon position from the Player center
    
    
    
    
    

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
        this.barrel     = new Point(0, ALIEN1_HEIGHT/2);
        ImageIcon i     = new ImageIcon(PATH_ALIEN1_IMG);
        this.img        = i.getImage();
        this.shootType  = new ShootLaser(this, barrel, 1);
        this.width      = ALIEN1_WIDTH;
        this.height     = ALIEN1_HEIGHT;
    }
}
