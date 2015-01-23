/*
 * Class :      ObservableGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.observers;





/**
 * <h1>ObservableGame</h1>
 * <p>public interface ObservableGame</p>
 *
 * @author Constantin MASSON
 */
public interface ObservableCharacter {
    /**
     * Add one observer
     * @param obs 
     */
    public void addObserver(ObserverCharacter obs);
    
    /**
     * Delete all observers
     */
    public void deleteAllObservers();
    
    /**
     * Notify all observers
     */
    public void notifyObservers();
}
