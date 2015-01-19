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
    public static final int DELAY                           = 17;
    public static final int DEFAULT_LEFT_POSITION           = 50;
    public static final int DEFAULT_Y_POSITION              = 50;
    public static final int GAP_BETWEEN_ALIENS              = 10;
    
    public static final int BOMB_WIDTH                      = 1;
    public static final int BOMB_HEIGHT                     = 5;
    public static final int LASER_HEIGHT                    = 5;
    public static final int LASER_WIDTH                     = 1;
    
    public static final int ALIEN_WIDTH                     = 12;
    public static final int ALIEN_HEIGHT                    = 12;
    public static final int PLAYER_WIDTH                    = 15;
    public static final int PLAYER_HEIGHT                   = 10;
    
    
    public static final int GAME_MAP_WIDTH                  = 358;
    public static final int GAME_MAP_HEIGHT                 = 350;
    public static final int GROUND                          = 300;
    
    
    
    //**************************************************************************
    // View - dimension constants
    //**************************************************************************
    public static final int         FRAME_WIDTH             = 1250;
    public static final int         FRAME_HEIGHT            = 850;
    public static final Dimension   DIM_FRAME_MIN           = new Dimension(450,250);
    public static final Dimension   DIM_ICON_TOOLS          = new Dimension(40,40);
    
    
    
    //**************************************************************************
    // Label - Font constants
    //**************************************************************************
    public static final int         LEFT_LABEL_SIZE         = 20;
    public static final int         LEFT_LABEL_TITLE_SIZE   = 25;
    
    
    
    //**************************************************************************
    // Paths constants
    //**************************************************************************
    public static final String PATH_ICON_TOOLS  = "img/icon/miniatures/";
    
}
