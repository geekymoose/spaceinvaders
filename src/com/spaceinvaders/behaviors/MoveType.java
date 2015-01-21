/*
 * Class :      MoveType
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;





/**
 * <h1>MoveType</h1>
 * <p>public interface MoveType</p>
 *
 * @author Constantin MASSON
 */
public interface MoveType {
    
    /**
     * Process a move
     * @param direction movement direction
     */
    public void move(int direction);
}
