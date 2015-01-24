
package com.spaceinvaders.tools;

import com.spaceinvaders.models.Alien;
import com.spaceinvaders.models.ModelGame;
import com.spaceinvaders.models.Player;
import com.spaceinvaders.weapons.Projectile;

/*
 * Class :      ManagerCollision
 * Creation:    Jan 24, 2015
 * Author :     Constantin MASSON
 * 
 */






/**
 * <h1>ManagerCollision</h1>
 * <p>public class ManagerCollision</p>
 * <p>This class manage all collision in the program
 *
 * @author Constantin MASSON
 */
public class ManagerCollision {
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ModelGame       map;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ManagerCollision
     * @param pMap where the collision are processed
     */
    public ManagerCollision(ModelGame pMap){
        this.map = pMap;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Process the collision manager: Check if a projectile hit something and
     * do what the projectile must do over the hit item
     */
    public void processCollision(){
        for(int k=0; k<this.map.getPlayerShoot().size(); k++){
            Projectile p    = this.map.getPlayerShoot().get(k);
            Object obj = p.checkCollision(map);
            
            /*
             * Hit nothing but could have reached the border extremity
             * Do not forget the k-- which is very important! Because of the 
             * destroyeProjectile, the current k value must be decremented by one!!!
             * The total size (getPlayerShoot().size()) is sub by one
             */
            if(obj==null){
                if(p.borderlandReached()){
                    this.map.destroyeProjectile(p);
                    this.map.getPlayer().reload();
                    k--;
                }
            }
            
            //Hit alien or the player, in this case, destroy the projectile and the target
            else{
                if(obj instanceof Player){
                    //To do later
                }
                else if(obj instanceof Alien){
                    this.map.destroyeProjectile(p);
                    this.map.killOneAlien((Alien)obj);
                    this.map.getPlayer().reload();
                    k--;
                }
            }
        }
    }
}
