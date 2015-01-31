/*
 * Class :      FireSmokeMissile
 * Creation:    Jan 31, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.tools.events.Smoke;
import com.spaceinvaders.tools.events.SmokeFireMissile;
import com.spaceinvaders.weapons.Missile;





/**
 * <h1>FireSmokeMissile</h1>
 * <p>public class FireSmokeMissile</p>
 *
 * @author Constantin MASSON
 */
public class FireSmokeMissile implements FireSmokeType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Missile           missile;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new fire smoke for missile
     * @param pMissile Missile linked
     */
    public FireSmokeMissile(Missile pMissile){
        this.missile    = pMissile;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Smoke spreadSmoke(){
        return new SmokeFireMissile(this.missile.getCenter(), this.missile.getMap());
    }
}
