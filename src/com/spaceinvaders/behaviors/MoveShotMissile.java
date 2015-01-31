/*
 * Class :      MoveShotMissile
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.weapons.Missile;
import java.awt.Point;





/**
 * <h1>MoveShotMissile</h1>
 * <p>public class MoveShotMissile</p>
 *
 * @author Constantin MASSON
 */
public class MoveShotMissile implements MoveShotType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Missile       missile;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new MoveShotType for a missile
     * @param pMissile missile tie
     */
    public MoveShotMissile(Missile pMissile){
        this.missile = pMissile;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        this.missile.setCenter(new Point(this.missile.getPosX(), this.missile.getPosY()-MISSILE_SPEED ));
    }
    
    @Override
    public void moveDirection(int direction){
    }
}
