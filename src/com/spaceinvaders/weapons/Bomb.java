/*
 * Class :      Bomb
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import static com.spaceinvaders.constants.Commons.IMG_MISSILE;
import com.spaceinvaders.models.Living;
import java.util.ArrayList;
import javax.swing.ImageIcon;





/**
 * <h1>Bomb</h1>
 * <p>
 public class Bomb<br/>
 * extends Projectile
 * </p>
 *
 * @author Constantin MASSON
 */
public class Bomb extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new bomb
     * @param pX        x coordinate
     * @param pY        y coordinate
     * @param pOwner    owner
     */
    public Bomb(int pX, int pY, Living pOwner){
        super(pX, pY, MISSILE_WIDTH, MISSILE_WIDTH, pOwner);
        ImageIcon i         = new ImageIcon(IMG_MISSILE);
        this.img            = i.getImage();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
