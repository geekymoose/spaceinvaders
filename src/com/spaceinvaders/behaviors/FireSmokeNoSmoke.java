/*
 * Class :      FireSmokeNoSmoke
 * Creation:    Jan 31, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.tools.events.Smoke;





/**
 * <h1>FireSmokeNoSmoke</h1>
 * <p>public class FireSmokeNoSmoke</p>
 *
 * @author Constantin MASSON
 */
public class FireSmokeNoSmoke  implements FireSmokeType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public FireSmokeNoSmoke(){
    
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Smoke spreadSmoke(){
        return null;
    }
}
