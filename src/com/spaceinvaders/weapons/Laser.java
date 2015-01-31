/*
 * Class :      Laser
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.behaviors.FireSmokeNoSmoke;
import com.spaceinvaders.behaviors.MoveShotLaser;
import com.spaceinvaders.models.Living;
import com.spaceinvaders.models.GameModel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;





/**
 * <h1>Laser</h1>
 * <p>
 public class Laser<br/>
 * extends Projectile
 * </p>
 *
 * @author Constantin MASSON
 */
public class Laser extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new laser
     * @param pX        x coordinate
     * @param pY        y coordinate
     * @param pOwner    owner
     */
    public Laser(int pX, int pY, Living pOwner){
        super(pX, pY, MISSILE_WIDTH, MISSILE_WIDTH, pOwner);
        ImageIcon i         = new ImageIcon(IMG_WEAPONS+"laser.png");
        this.img            = i.getImage();
        this.moveShootType  = new MoveShotLaser(this);
        this.fireSmokeType  = new FireSmokeNoSmoke();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Object checkCollision(GameModel map){
        Rectangle r1 = this.getBounds();
        return r1.intersects(map.getPlayer().getBounds()) ? map.getPlayer() : null;
    }
}
