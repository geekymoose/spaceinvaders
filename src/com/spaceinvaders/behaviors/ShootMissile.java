/*
 * Class :      ShootMissile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.weapons.Missile;





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
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ShootMissile type with its owner
     * @param pOwner 
     * @param pAmmo Ammo at the creation
     */
    public ShootMissile(Living pOwner, int pAmmo){
        this.owner  = pOwner;
        this.ammo   = pAmmo;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public boolean fire(ModelGame world){
        if(this.ammo>0){
            this.ammo--;
            int posX    = this.owner.getBarrel().x;
            int posY    = this.owner.getBarrel().y;
            //System.out.println("X"+posX+" Y :"+posY);
            world.getPlayerShoot().add(new Missile(posX, posY, this.owner));
            world.notifyObservers();
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
