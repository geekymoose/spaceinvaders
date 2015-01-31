/*
 * Class :      Missile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.behaviors.FireSmokeMissile;
import com.spaceinvaders.behaviors.MoveShotMissile;
import com.spaceinvaders.models.Alien;
import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.GameModel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;





/**
 * <h1>Missile</h1>
 * <p>public class Missile</p>
 *
 * @author Constantin MASSON
 */
public class Missile extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new missile
     * @param pX        x coordinate
     * @param pY        y coordinate
     * @param pOwner    owner
     */
    public Missile(int pX, int pY, Living pOwner){
        super(pX, pY, MISSILE_WIDTH, MISSILE_WIDTH, pOwner);
        ImageIcon i         = new ImageIcon(IMG_WEAPONS+"missile.png");
        this.img            = i.getImage();
        this.moveShootType  = new MoveShotMissile(this);
        this.fireSmokeType  = new FireSmokeMissile(this);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Object checkCollision(GameModel map){
        Rectangle r1 = this.getBounds();
        
        /*
         * Check if hit a Living (Player and Alien)
         */
        for(Alien a : map.getListAliens()){
            Rectangle r2 = a.getBounds();
            if(r1.intersects(r2)){
                return a;
            }
        }
        
        //Here, means nothing were hit
        return null;
    }
}
