/*
 * Class :      laser
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.models.Sprite;
import java.awt.Rectangle;
import java.util.ArrayList;





/**
 * <h1>laser</h1>
 * <p>
 * public class laser<br/>
 * extends Projectile
 * </p>
 *
 * @author Constantin MASSON
 */
public class laser extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new laser shoot
     * @param pX        x coordinate
     * @param pY        y coordinate
     */
    public laser(int pX, int pY){
        super(pX, pY, LASER_WIDTH, LASER_HEIGHT);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        this.y -= 1;
    }

    @Override
    public Sprite hits(ArrayList<Sprite> pList){
        return null;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
