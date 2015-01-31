/*
 * Class :      MoveShootMissile
 * Creation:    Jan 23, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.weapons.Bomb;
import java.awt.Point;





/**
 * <h1>MoveShotBomb</h1>
 * <p>public class MoveShotBomb</p>
 *
 * @author Constantin MASSON
 */
public class MoveShotBomb implements MoveShotType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Bomb       bomb;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new MoveShotType for a bomb
     * @param pBomb bomb tie
     */
    public MoveShotBomb(Bomb pBomb){
        this.bomb = pBomb;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        this.bomb.setCenter(new Point(this.bomb.getPosX(), this.bomb.getPosY()+BOMB_SPEED ));
    }
    
    @Override
    public void moveDirection(int direction){
    }
}
