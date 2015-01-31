/*
 * Class :      Smoke
 * Creation:    Jan 31, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.events;

import com.spaceinvaders.models.Map;
import java.awt.Point;





/**
 * <h1>Smoke</h1>
 * <p>
 * public class Smoke<br/>
 * extends DynamicEvent
 * </p>
 *
 * <p>This class create smoke event like the one behind a fire or a projectile</p>
 * 
 * @author Constantin MASSON
 */
public abstract class Smoke extends DynamicEvent{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    public Smoke(Point pPosition, int pDelay, Map pModel){
        super(pPosition, pDelay, pModel);
    }
}
