/*
 * Class :      ModelGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.weapons.Projectile;
import java.util.ArrayList;





/**
 * <h1>ModelGame</h1>
 * <p>public class ModelGame</p>
 * 
 * <p>Data about the game</p>
 *
 * @author Constantin MASSON
 */
public class ModelGame implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ArrayList<Sprite>       listAlien; //Only alien inside
    private     Player                  player;
    private     ArrayList<Projectile>   listAlienShoot;
    private     ArrayList<Projectile>   listPlayerShoot;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create the game model
     * Initialize the map with default value
     */
    public ModelGame(){
        this.initMap();
    }
    
    
    /*
     * Initialize the map 
     */
    private void initMap(){
        this.listAlien          = new ArrayList();
        this.player             = new Player(GAME_MAP_WIDTH/2, GAME_MAP_HEIGHT);
        this.listAlienShoot     = new ArrayList();
        this.listPlayerShoot    = new ArrayList();
        
        this.placeInitialeSpaceInvaders();
    }
    
    
    /*
     * Place the initiale space invaders
     * There are 5 lines with 11 invaders by lines
     * The highest is filled by alien3, the 2 after are with alien2
     * the 2 last are filled with alien1
     */
    private void placeInitialeSpaceInvaders(){
        //First line with alien3 (Calculation start at x=0, y=0)
        for(int x=0; x<11; x++){
            int posX = DEFAULT_LEFT_POSITION + (x*ALIEN_WIDTH) + GAP_BETWEEN_ALIENS;
            this.listAlien.add(new Alien3(posX, DEFAULT_Y_POSITION));
        }
        
        //Lines 2-3
        for(int x=0; x<11; x++){
            for(int y=1; y<3; y++){
                int posX = DEFAULT_LEFT_POSITION + (x*ALIEN_WIDTH) + GAP_BETWEEN_ALIENS;
                int posY = DEFAULT_Y_POSITION + (y*ALIEN_HEIGHT)  + GAP_BETWEEN_ALIENS;
                this.listAlien.add(new Alien2(posX, posY));
            }
        }
        
        //Lines 4-5
        for(int x=0; x<11; x++){
            for(int y=3; y<5; y++){
                int posX = DEFAULT_LEFT_POSITION + (x*ALIEN_WIDTH) + GAP_BETWEEN_ALIENS;
                int posY = DEFAULT_Y_POSITION + (y*ALIEN_HEIGHT)  + GAP_BETWEEN_ALIENS;
                this.listAlien.add(new Alien1(posX, posY));
            }
        }
    }
    
    
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
