/*
 * Class :      ShootType
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.ModelGame;





/**
 * <h1>ShootType</h1>
 * <p>public interface ShootType</p>
 *
 * @author Constantin MASSON
 */
public interface ShootType {
    
    /**
     * Process a shoot
     * @param world Where to add a shoot
     * @return true if shoot performed, otherwise, return false
     */
    public abstract boolean fire(ModelGame world);
    
    /**
     * Reload the weapon
     * @param pAmmo Ammo to add
     * @return true if reloaded, otherwise, return false
     */
    public abstract boolean reload(int pAmmo);
}
