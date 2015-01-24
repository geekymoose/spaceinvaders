/*
 * Class :      ModelGame
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.models;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.observers.ObservableGame;
import com.spaceinvaders.observers.ObserverGame;
import com.spaceinvaders.tools.*;
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
public class ModelGame implements Commons, ObservableGame{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Player                  player;
    private     ArrayList<Alien>        listAliens; //Only alien inside
    private     ArrayList<Projectile>   listAlienShoot;
    private     ArrayList<Projectile>   listPlayerShoot;
    private     ArrayList<ObserverGame> listObservers;
    private     int                     currentScore;
    private     int                     nbAliens;
    
    private     TimerPlayer             timerPlayer;
    private     TimerShoot              timerShoot;
    private     TimerAlien              timerAlien;
    private     TimerGeneral            timerGeneral;
    
    private     ManagerCollision        managerCollision;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create the game model
     * Initialize the map with default value
     */
    public ModelGame(){
        this.listObservers      = new ArrayList();
        this.managerCollision   = new ManagerCollision(this);
    }
    
    
    /*
     * Initialize the map
     * Create the list, the player, set the nbAlien and score
     * Place all space invaders and update the view
     * Then, the timers start
     */
    public void initMap(){
        this.player             = new Player(DEFAULT_PLAYER_POS_X, DEFAULT_PLAYER_POS_Y);
        this.listPlayerShoot    = new ArrayList();
        this.listAliens         = new ArrayList();
        this.listAlienShoot     = new ArrayList();
        
        this.nbAliens           = 55; //11 * 5
        this.currentScore       = 0;
        
        this.placeInitialeSpaceInvaders();
        this.notifyCreateMap();
        
        //Create the timer
        this.timerPlayer        = new TimerPlayer(this.player);
        this.timerShoot         = new TimerShoot(   this.listAlienShoot, 
                                                    this.listPlayerShoot,
                                                    this.managerCollision);
        this.timerAlien         = new TimerAlien(this.listAliens);
        this.timerGeneral       = new TimerGeneral(this);
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
            int posX = GAP_LEFT + (x*GAP_BETWEEN_ALIENS);
            this.listAliens.add(new Alien1(posX, GAP_TOP));
        }
        
        //Lines 2-3
        for(int x=0; x<11; x++){
            for(int y=1; y<3; y++){
                int posX = GAP_LEFT + (x*GAP_BETWEEN_ALIENS);
                int posY = GAP_TOP + (y*GAP_BETWEEN_ALIENS);
                this.listAliens.add(new Alien2(posX, posY));
            }
        }
        
        //Lines 4-5
        for(int x=0; x<11; x++){
            for(int y=3; y<5; y++){
                int posX = GAP_LEFT + (x*GAP_BETWEEN_ALIENS);
                int posY = GAP_TOP + (y*GAP_BETWEEN_ALIENS);
                this.listAliens.add(new Alien3(posX, posY));
            }
        }
    }
    
    /**
     * Start every timer, means the game start
     */
    public void startTimers(){
        this.timerPlayer.startTimer();
        this.timerShoot.startTimer();
        this.timerAlien.startTimer();
        this.timerGeneral.startTimer();
    }
    
    /**
     * Stop the game
     */
    public void stopTimers(){
        this.timerPlayer.stopTimer();
        this.timerShoot.stopTimer();
        this.timerAlien.stopTimer();
        this.timerGeneral.stopTimer();
    }
    
    
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Kill one alien. This alien will be removed from the list
     * @param pAlien
     */
    public void killOneAlien(Alien pAlien){
        this.currentScore += pAlien.getScoreValue();
        this.listAliens.remove(pAlien);
        this.nbAliens--;
    }
    
    /**
     * Destroy this projectile
     * @param p projectile to destroy
     */
    public void destroyeProjectile(Projectile p){
        this.listPlayerShoot.remove(p);
        this.listAlienShoot.remove(p);
    }
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    /**
     * Get the current player score
     * @return score
     */
    public int getScore(){
        return this.currentScore;
    }
    
    /**
     * Get the number of remaining aliens
     * @return 
     */
    public int getNbAliens(){
        return this.nbAliens;
    }
    
    /**
     * Get the player
     * @return 
     */
    public Player getPlayer(){
        return this.player;
    }
    
    /**
     * Return the alien list
     * @return 
     */
    public ArrayList<Alien> getListAliens(){
        return this.listAliens;
    }
    
    /**
     * Get the list of player shoots
     * @return 
     */
    public ArrayList<Projectile> getPlayerShoot(){
        return this.listPlayerShoot;
    }
    
    /**
     * Get the list of alien shoots
     * @return 
     */
    public ArrayList<Projectile> getAlienShoot(){
        return this.listAlienShoot;
    }
    
    
    
    
    

    //**************************************************************************
    // Observers
    //**************************************************************************
    @Override
    public void addObserver(ObserverGame obs){
        this.listObservers.add(obs);
    }

    @Override
    public void deleteAllObservers(){
        this.listObservers = new ArrayList();
    }
    
    @Override
    public void notifyObservers(){
        for(ObserverGame obs : this.listObservers){
            obs.update(this);
        }
    }
    
    @Override
    public void notifyCreateMap(){
        for(ObserverGame obs : this.listObservers){
            obs.updateInitMap(this);
        }
    }
}
