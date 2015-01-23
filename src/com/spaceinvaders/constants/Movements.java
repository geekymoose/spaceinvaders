/*
 * Class :      Movements
 * Creation:    Jan 20, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.constants;





/**
 * <h1>Movements</h1>
 * <p>public interface Movements</p>
 *
 * @author Constantin MASSON
 */
public interface Movements {
    public static final int MOVE_LEFT           = -1;
    public static final int MOVE_RIGHT          = 1;
    public static final int MOVE_DOWN           = 2;
    public static final int MOVE_STOP           = 0;
    
    public static final int MOVE_OPPOSITE       = 4;
    public static final int MOVE_UNMODIFIED     = 5;
    
    public static final int PLAYER_SPEED        = 2;
    public static final int ALIEN_SPEED         = 5;
    public static final int ALIEN_DOWN_SPEED    = 7;
    public static final int MISSILE_SPEED       = 2;
}
