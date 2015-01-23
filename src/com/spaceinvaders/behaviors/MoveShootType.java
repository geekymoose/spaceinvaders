/*
 * Class :      MoveType
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.constants.Movements;





/**
 * <h1>MoveType</h1>
 * <p>public interface MoveType</p>
 *
 * @author Constantin MASSON
 */
public interface MoveShootType extends Movements{
    
    /**
     * Process a move
     */
    public void move();
    
    /**
     * Start the move
     * @param direction new direction
     */
    public void moveDirection(int direction);
}
