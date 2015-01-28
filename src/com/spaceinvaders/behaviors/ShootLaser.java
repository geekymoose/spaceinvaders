/*
 * Class :      ShootLaser
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.weapons.Laser;
import java.awt.Point;





/**
 * <h1>ShootLaser</h1>
 * <p>
 * public class ShootLaser<br/>
 * implements ShootType
 * </p>
 *
 * @author Constantin MASSON
 */
public class ShootLaser implements ShootType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Living    owner;
    private     Point           barrelPosition;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ShootLaser type with its owner
     * @param pOwner 
     * @param pBarrel 
     */
    public ShootLaser(Living pOwner, Point pBarrel){
        this.owner          = pOwner;
        this.barrelPosition = pBarrel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public boolean fire(ModelGame world){
        int posX    = this.owner.getCenter().x+this.barrelPosition.x;
        int posY    = this.owner.getCenter().y+this.barrelPosition.y;
        world.getAlienShoot().add(new Laser(posX, posY, this.owner));
        world.notifyObservers();
        return true;
    }
    
    @Override
    public boolean reload(int pAmmo){
        return true;
    }
}
