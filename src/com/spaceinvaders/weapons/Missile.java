/*
 * Class :      Missile
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import static com.spaceinvaders.constants.Commons.PATH_PLAYER_IMG;
import com.spaceinvaders.models.Living;
import java.util.ArrayList;
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
        ImageIcon i         = new ImageIcon(IMG_MISSILE);
        this.img            = i.getImage();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public Living hits(ArrayList<Living> pList){
        return null;
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
