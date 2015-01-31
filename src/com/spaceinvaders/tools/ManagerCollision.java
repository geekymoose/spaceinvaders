
package com.spaceinvaders.tools;

import com.spaceinvaders.tools.events.ExplosionAlien;
import com.spaceinvaders.models.Alien;
import com.spaceinvaders.models.GameModel;
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
    private     GameModel       map;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ManagerCollision
     * @param pMap where the collision are processed
     */
    public ManagerCollision(GameModel pMap){
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
        
        /*
         * Collision with player projectiles
         */
        for(int k=0; k<this.map.getPlayerShoot().size(); k++){
            Projectile p    = this.map.getPlayerShoot().get(k);
            Object obj      = p.checkCollision(map);
            
            /*
             * Hit nothing but could have reached the border extremity
             * Do not forget the k-- which is very important! Because of the 
             * destroyeProjectile, the current k value must be decremented by one!!!
             * The total size (getPlayerShoot().size()) is sub by one
             */
            if(obj==null){
                if(p.borderlandReached()){
                    this.map.projectileExplode(new ExplosionAlien(p.getCenter(),this.map));
                    this.map.destroyeProjectile(p);
                    this.map.getPlayer().reload();
                    k--;
                }
            }
            
            /*
             * hit player : do nothing (It is him projectile XD)
             * hit alien : kill him
             */
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
        
        
        /*
         * Collisions with aliens shoots
         * Note: listAlienShot could be only a variable because, only one 
         * alien shoot must be present at the same time. But, one never kown
         * maybe for a next extension..
         */
        for(int k=0; k<this.map.getAlienShoot().size(); k++){
            Projectile p    = this.map.getAlienShoot().get(k);
            Object obj      = p.checkCollision(map);
            
            /*
             * Hit nothing but could have reached the border extremity
             * Do not forget the k-- which is very important! Because of the 
             * destroyeProjectile, the current k value must be decremented by one!!!
             * The total size (getPlayerShoot().size()) is sub by one
             */
            if(obj==null){
                if(p.borderlandReached()){
                    this.map.projectileExplode(new ExplosionAlien(p.getCenter(),this.map));
                    this.map.destroyeProjectile(p);
                    k--;
                }
            }
            
            /*
             * Hit alien : do nothing
             * hit player : kill player
             */
            else{
                if(obj instanceof Alien){
                    //To do later
                }
                else if(obj instanceof Player){
                    this.map.destroyeProjectile(p);
                    this.map.playerHurt();
                    k--;
                }
            }
        } //End management collision for aliens
    }
}
