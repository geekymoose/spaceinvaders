/*
 * Class :      MoveLivingType
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.constants.Movements;





/**
 * <h1>MoveLivingType</h1>
 * <p>public interface MoveLivingType</p>
 *
 * @author Constantin MASSON
 */
public interface MoveLivingType extends Movements{
    
    /**
     * Process a move
     */
    public void move();
    
    /**
     * Start the move
     * @param direction new direction
     */
    public void moveDirection(int direction);
    
    /**
     * Stop the move
     */
    public void stopMove();
}
