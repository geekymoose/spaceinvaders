/*
 * Class :      Alien3
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.behaviors.MoveLivingDefaultAlien;
import com.spaceinvaders.behaviors.ShootBomb;
import static com.spaceinvaders.constants.Commons.ALIEN1_HEIGHT;
import static com.spaceinvaders.constants.Commons.ALIEN1_WIDTH;
import java.awt.Point;
import javax.swing.ImageIcon;





/**
 * <h1>Alien3</h1>
 * <p>
 public class Alien3<br/>
 extends Alien
 </p>
 *
 * @author Constantin MASSON
 */
public class Alien3 extends Alien{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Point     barrel;//Extremity canon position from the Player center
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a Alien (type 3) at position x, y
     * @param pX x coordinate
     * @param pY y coordinate
     */
    public Alien3(int pX, int pY){
        super(pX, pY);
        this.barrel    = new Point(0, ALIEN3_HEIGHT/2);
        ImageIcon i     = new ImageIcon(PATH_ALIEN3_IMG);
        this.img        = i.getImage();
        this.shootType  = new ShootBomb(this, barrel, 1);
        this.moveType   = new MoveLivingDefaultAlien(this);
        this.width      = ALIEN3_WIDTH;
        this.height     = ALIEN3_HEIGHT;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
