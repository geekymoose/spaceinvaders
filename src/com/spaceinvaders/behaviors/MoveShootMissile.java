/*
 * Class :      MoveShootMissile
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.weapons.Missile;
import java.awt.Point;





/**
 * <h1>MoveShootMissile</h1>
 * <p>public class MoveShootMissile</p>
 *
 * @author Constantin MASSON
 */
public class MoveShootMissile implements MoveShootType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Missile       missile;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new MoveShootType for a missile
     * @param pMissile missile tie
     */
    public MoveShootMissile(Missile pMissile){
        this.missile = pMissile;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        this.missile.setCenter(new Point(this.missile.getPosX(), this.missile.getPosY()-1 ));
    }
    
    @Override
    public void moveDirection(int direction){
    }
}
