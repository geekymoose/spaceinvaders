/*
 * Class :      ShootMissile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.GameModel;
import com.spaceinvaders.tools.SoundEffect;
import com.spaceinvaders.weapons.Missile;
import java.awt.Point;





/**
 * <h1>ShootMissile</h1>
 * <p>
 * public class ShootMissile<br/>
 * implements ShootType
 * </p>
 *
 * @author Constantin MASSON
 */
public class ShootMissile implements ShootType{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     final Living    owner;
    private     int             ammo;
    private     Point           barrelPosition;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ShootMissile type with its owner
     * @param pOwner 
     * @param pBarrel   Barrel position (where owner center is the 0:0 point)
     * @param pAmmo     Ammo at the creation
     */
    public ShootMissile(Living pOwner, Point pBarrel, int pAmmo){
        this.owner          = pOwner;
        this.ammo           = pAmmo;
        this.barrelPosition = pBarrel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public boolean fire(GameModel world){
        if(this.ammo>0){
            this.ammo--;
            int posX    = this.owner.getCenter().x+this.barrelPosition.x;
            int posY    = this.owner.getCenter().y+this.barrelPosition.y;
            world.addPlayerProjectile(new Missile(posX, posY, this.owner));
            world.notifyObservers();
            SoundEffect.SHOOT.play();
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean reload(int pAmmo){
        this.ammo = pAmmo;
        return true;
    }
}
