/*
 * Class :      Commons
 * Creation:    Jan 18, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.constants;

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
    public static final int BOARD_WIDTH                     = 358;
    public static final int BOARD_HEIGTH                    = 350;
    public static final int GROUND                          = 290;
    public static final int BOMB_HEIGHT                     = 5;
    public static final int ALIEN_HEIGHT                    = 12;
    public static final int ALIEN_WIDTH                     = 12;
    public static final int BORDER_RIGHT                    = 30;
    public static final int BORDER_LEFT                     = 5;
    public static final int GO_DOWN                         = 15;
    public static final int NUMBER_OF_ALIENS_TO_DESTROY     = 24;
    public static final int CHANCE                          = 5;
    public static final int DELAY                           = 17;
    public static final int PLAYER_WIDTH                    = 15;
    public static final int PLAYER_HEIGHT                   = 10;
    
    
    
    //**************************************************************************
    // View - dimension constants
    //**************************************************************************
    public static final int         FRAME_WIDTH             = 1250;
    public static final int         FRAME_HEIGHT            = 850;
    public static final Dimension   DIM_FRAME_MIN           = new Dimension(450,250);
    public static final Dimension   DIM_ICON_TOOLS          = new Dimension(45,45);
    
    
    
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
