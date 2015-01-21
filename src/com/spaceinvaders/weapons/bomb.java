/*
 * Class :      bomb
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.weapons;

import com.spaceinvaders.models.Character;
import java.util.ArrayList;





/**
 * <h1>bomb</h1>
 * <p>
 * public class bomb<br/>
 * extends Projectile
 * </p>
 *
 * @author Constantin MASSON
 */
public class bomb extends Projectile{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new bomb
     * @param pX        x coordinate
     * @param pY        y coordinate
     */
    public bomb(int pX, int pY){
        super(pX, pY, BOMB_WIDTH, BOMB_WIDTH);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void move(){
        this.posY += 1;
    }

    @Override
    public Character hits(ArrayList<Character> pList){
        return null;
    }
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
