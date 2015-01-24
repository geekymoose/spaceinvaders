/*
 * Class :      TimerAlien
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.constants.Movements;
import com.spaceinvaders.models.Alien;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;





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
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a timer for alien movement
     * @param pList 
     */
    public TimerAlien(ArrayList<Alien> pList){
        super(DELAY_ALIEN);
        this.listAliens     = pList;
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    @Override
    public void actionPerformed(ActionEvent e){
        boolean moveDown    = false;
        
        /*
         * if at least one alien reached the border, the direction is changed
         * and one move down is performed.
         * The GAP_BETWEEN_ALIENS is arbitrary (max gap between alien and border)
         */
        for(int k=0; k<this.listAliens.size(); k++){
            
            Point p = this.listAliens.get(k).getCenter();
            if(p.x>(GAME_WIDTH - (this.listAliens.get(k).getWidth()+GAP_BETWEEN_ALIENS))
                || p.x<this.listAliens.get(k).getWidth()){
                moveDown = true;
            }
        }
        
        
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
