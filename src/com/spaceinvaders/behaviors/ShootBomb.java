/*
 * Class :      ShootBomb
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.weapons.Bomb;
import java.awt.Point;





/**
 * <h1>ShootBomb</h1>
 * <p>
 * public class ShootBomb<br/>
 * implements ShootType
 * </p>
 *
 * @author Constantin MASSON
 */
public class ShootBomb implements ShootType{
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
     * Create a new ShootBomb type with its owner
     * @param pOwner 
     * @param pAmmo Ammo at the creation
     */
    public ShootBomb(Living pOwner, Point pBarrel, int pAmmo){
        this.owner          = pOwner;
        this.ammo           = pAmmo;
        this.barrelPosition = pBarrel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public boolean fire(ModelGame world){
        if(this.ammo>0){
            this.ammo--;
            int posX    = this.barrelPosition.x;
            int posY    = this.barrelPosition.y;
            world.getPlayerShoot().add(new Bomb(posX, posY, this.owner));
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
