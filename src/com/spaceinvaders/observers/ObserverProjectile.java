/*
 * Class :      ObserverGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.observers;





/**
 * <h1>ObserverGame</h1>
 * <p>public interface ObserverGame</p>
 *
 * @author Constantin MASSON
 */
public interface ObserverProjectile {
    
    /**
     * Update the projectile position
     * @param obs
     */
    public void update(ObservableProjectile obs);
}
