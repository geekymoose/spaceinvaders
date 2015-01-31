/*
 * Class :      SmokeShootBomb
 * Creation:    Jan 31, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.events;

import com.spaceinvaders.models.ModelGame;
import java.awt.Point;





/**
 * <h1>SmokeShootBomb</h1>
 * <p>
 public class SmokeShootBomb<br/>
 * extends DynamicEvent
 * </p>
 * 
 * <p>This class create smoke event like the one behind a fire or a projectile
 *
 * @author Constantin MASSON
 */
public class SmokeShootBomb extends DynamicEvent{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create new smoke
     * @param pPosition
     * @param pDelay
     * @param pModel 
     */
    public SmokeShootBomb(Point pPosition, int pDelay, ModelGame pModel){
        super(pPosition, pDelay, pModel);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
