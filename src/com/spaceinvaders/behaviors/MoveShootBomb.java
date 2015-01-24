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
 * <h1>MoveShootBomb</h1>
 * <p>public class MoveShootBomb</p>
 *
 * @author Constantin MASSON
 */
public class MoveShootBomb implements MoveShootType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Bomb       bomb;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new MoveShootType for a bomb
     * @param pBomb bomb tie
     */
    public MoveShootBomb(Bomb pBomb){
        this.bomb = pBomb;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        this.bomb.setCenter(new Point(this.bomb.getPosX(), this.bomb.getPosY()+1 ));
    }
    
    @Override
    public void moveDirection(int direction){
    }
}
