/*
 * Class :      ShootBomb
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.behaviors;

import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.GameModel;
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
    private     Point           barrelPosition;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ShootBomb type with its owner
     * @param pOwner 
     * @param pBarrel
     */
    public ShootBomb(Living pOwner, Point pBarrel){
        this.owner          = pOwner;
        this.barrelPosition = pBarrel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public boolean fire(GameModel world){
        int posX    = this.owner.getCenter().x+this.barrelPosition.x;
        int posY    = this.owner.getCenter().y+this.barrelPosition.y;
        world.addAlienProjectile(new Bomb(posX, posY, this.owner));
        world.notifyObservers();
        return true;
    }
    
    @Override
    public boolean reload(int pAmmo){
        return true;
    }
}
