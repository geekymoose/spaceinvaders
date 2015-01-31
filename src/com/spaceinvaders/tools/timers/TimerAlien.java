/*
 * Class :      TimerAlien
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.timers;

import com.spaceinvaders.constants.Movements;
import com.spaceinvaders.models.Alien;
import com.spaceinvaders.models.GameModel;
import com.spaceinvaders.tools.RandomManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;





/**
 * <h1>TimerAlien</h1>
 * <p>
 * public class TimerAlien<br/>
 * extends TimerManager<br/>
 * implements Movements
 * </p>
 * 
 * <p>
 * This class manage the time
 * </p>
 *
 * @author Constantin MASSON
 */
public class TimerAlien extends TimerManager implements Movements{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     ArrayList<Alien>    listAliens;
    private     GameModel           modelMap;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a timer for alien movement
     * @param pModel
     */
    public TimerAlien(GameModel pModel){
        super(DELAY_ALIEN);
        this.listAliens     = pModel.getListAliens();
        this.modelMap       = pModel;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        boolean moveDown    = false;
        
        /*
         * If there is no more alien, player win
         */
        if(this.listAliens.isEmpty()){
            this.modelMap.victory();
            return;
        }
        
        /*
         * Aliens really want to kill you!! They are naughty!! Very naughty and
         * they want your beer!! 
         * One alien shoot, when the projectil reach ground, one more alien will
         * shoot. (Only on alien shoot is active at the same time)
         */
        if(this.modelMap.getAlienShoot().isEmpty()){
            int rand    = RandomManager.getRandomBetween(0, this.listAliens.size()-1);
            Alien a     = this.listAliens.get(rand); //Alien who will shot
            a.fire(modelMap);
        }
        
        /*
         * If at least one alien reached the border, the direction is changed
         * and one move down is performed.
         * The GAP_BETWEEN_ALIENS is arbitrary (max gap between alien and border)
         */
        for(int k=0; k<this.listAliens.size(); k++){
            Point p = this.listAliens.get(k).getCenter();
            if(p.y>GROUND){
                this.modelMap.gameOver();
            }
            if(p.x>(GAME_WIDTH - (this.listAliens.get(k).getWidth()+GAP_BETWEEN_ALIENS))
                || p.x<this.listAliens.get(k).getWidth()){
                moveDown = true;
            }
        }
        
        
        /*
         * Process alien movements
         * If one alien reached border, movement will be opposite
         */
        for(int k=0; k<this.listAliens.size(); k++){
            if(moveDown == true){
                this.listAliens.get(k).moveDirection(MOVE_OPPOSITE);
            }
            else{
                this.listAliens.get(k).moveDirection(MOVE_UNMODIFIED);
            }
            this.listAliens.get(k).move();
        }
    }
}
