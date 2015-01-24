/*
 * Class :      Commons
 * Creation:    Jan 18, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.constants;

import java.awt.Dimension;





/**
 * <h1>Commons</h1>
 * <p>public interface Commons</p>
 *
 * @author Constantin MASSON
 */
public interface Commons {
    //**************************************************************************
    // Game constants
    //**************************************************************************
    public static final int DELAY_GENERAL                   = 5;
    public static final int DELAY_PLAYER                    = 5;
    public static final int DELAY_ALIEN                     = 400;
    public static final int DELAY_SHOOT                     = 5;
    
    public static final int GAP_LEFT                        = 50;
    public static final int GAP_TOP                         = 50;
    public static final int GAP_BETWEEN_ALIENS              = 70;
    
    public static final int BOMB_WIDTH                      = 3;
    public static final int BOMB_HEIGHT                     = 10;
    public static final int LASER_WIDTH                     = 1;
    public static final int LASER_HEIGHT                    = 5;
    public static final int MISSILE_WIDTH                   = 3;
    public static final int MISSILE_HEIGHT                  = 10;
    
    //ALien and player size
    public static final int ALIEN1_WIDTH                    = 30;
    public static final int ALIEN1_HEIGHT                   = 30;
    public static final int ALIEN2_WIDTH                    = 50;
    public static final int ALIEN2_HEIGHT                   = 33;
    public static final int ALIEN3_WIDTH                    = 50;
    public static final int ALIEN3_HEIGHT                   = 33;
    public static final int PLAYER_WIDTH                    = 50;
    public static final int PLAYER_HEIGHT                   = 33;
    
    
    public static final int GAME_WIDTH                      = 950;
    public static final int GAME_HEIGHT                     = 650;
    public static final int GROUND                          = GAME_HEIGHT-45;
    public static final int DEFAULT_PLAYER_POS_X            = 100;
    public static final int DEFAULT_PLAYER_POS_Y            = GROUND-PLAYER_HEIGHT-3;
    
    public static final int MIN_PLAYER_POSITION            = PLAYER_WIDTH+5;
    public static final int MAX_PLAYER_POSITION            = GAME_WIDTH-(PLAYER_WIDTH+5);
    
    
    
    //**************************************************************************
    // View - dimension constants
    //**************************************************************************
    public static final Dimension   DIM_ICON_TOOLS          = new Dimension(40,40);
    public static final Dimension   DIM_FRAME_MIN           = new Dimension(450,250);
    public static final Dimension   DIM_GAME                = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    
    
    
    //**************************************************************************
    // Label - Font constants
    //**************************************************************************
    public static final int         LEFT_LABEL_SIZE         = 20;
    public static final int         LEFT_LABEL_TITLE_SIZE   = 25;
    
    
    
    //**************************************************************************
    // Paths constants
    //**************************************************************************
    public static final String PATH_ICON_TOOLS  = "img/icon/miniatures/";
    public static final String PATH_PLAYER_IMG  = "img/resized/player.png";
    public static final String PATH_ALIEN1_IMG  = "img/resized/alien1_pos1.png";
    public static final String PATH_ALIEN1_IMG2 = "img/resized/alien1_pos2.png";
    public static final String PATH_ALIEN2_IMG  = "img/resized/alien2_pos1.png";
    public static final String PATH_ALIEN2_IMG2 = "img/resized/alien2_pos2.png";
    public static final String PATH_ALIEN3_IMG  = "img/resized/alien3_pos1.png";
    public static final String PATH_ALIEN3_IMG2 = "img/resized/alien3_pos2.png";
    public static final String IMG_MISSILE      = "img/resized/missile.png";
    public static final String IMG_BACKGROUND   = "img/resized/background.png";
}
