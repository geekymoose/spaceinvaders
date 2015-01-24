/*
 * Class :      Laser
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.behaviors.MoveShootLaser;
import static com.spaceinvaders.constants.Commons.IMG_MISSILE;
import com.spaceinvaders.models.Living;
import javax.swing.ImageIcon;





/**
 * <h1>Laser</h1>
 * <p>
 public class Laser<br/>
 * extends Projectile
 * </p>
 *
 * @author Constantin MASSON
 */
public class Laser extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new laser
     * @param pX        x coordinate
     * @param pY        y coordinate
     * @param pOwner    owner
     */
    public Laser(int pX, int pY, Living pOwner){
        super(pX, pY, MISSILE_WIDTH, MISSILE_WIDTH, pOwner);
        ImageIcon i         = new ImageIcon(IMG_MISSILE);
        this.img            = i.getImage();
        this.moveShootType  = new MoveShootLaser(this);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
