/*
 * Class :      Missile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.behaviors.MoveShootMissile;
import com.spaceinvaders.models.Living;
import java.util.ArrayList;
import javax.swing.ImageIcon;





/**
 * <h1>Missile</h1>
 * <p>public class Missile</p>
 *
 * @author Constantin MASSON
 */
public class Missile extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new missile
     * @param pX        x coordinate
     * @param pY        y coordinate
     * @param pOwner    owner
     */
    public Missile(int pX, int pY, Living pOwner){
        super(pX, pY, MISSILE_WIDTH, MISSILE_WIDTH, pOwner);
        ImageIcon i         = new ImageIcon(IMG_MISSILE);
        this.img            = i.getImage();
        this.moveShootType  = new MoveShootMissile(this);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Living hits(ArrayList<Living> pList){
        return null;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
