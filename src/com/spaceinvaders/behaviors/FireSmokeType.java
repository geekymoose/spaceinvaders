/*
 * Class :      FireSmokeType
 * Creation:    Jan 31, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.tools.events.Smoke;





/**
 * <h1>FireSmokeType</h1>
 * <p>public interface FireSmokeType</p>
 * 
 * <p>Interface for smoke created after a shot</p>
 *
 * @author Constantin MASSON
 */
public interface FireSmokeType {
    
    /**
     * Create a new smoke where the projectile is
     * @return Smoke
     */
    public Smoke spreadSmoke();
}
