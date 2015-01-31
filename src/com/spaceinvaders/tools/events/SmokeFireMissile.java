/*
 * Class :      SmokeFireMissile
 * Creation:    Jan 31, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.events;

import static com.spaceinvaders.constants.Commons.PATH_IMG_EXPLOSION;
import com.spaceinvaders.models.Map;
import java.awt.Point;
import javax.swing.ImageIcon;





/**
 * <h1>SmokeFireMissile</h1>
 * <p>
 * public class SmokeFireMissile<br/>
 * extends DynamicEvent
 * </p>
 * 
 * <p>Smoke for a missile shot</p>
 *
 * @author Constantin MASSON
 */
public class SmokeFireMissile extends Smoke{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create new smoke
     * @param pPosition
     * @param pMap
     */
    public SmokeFireMissile(Point pPosition, Map pMap){
        super(pPosition, DELAY_SMOKE_FIRE_MISSILE, pMap);
        
        ImageIcon i1    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_1.png");
        ImageIcon i2    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_2.png");
        ImageIcon i3    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_3.png");
        ImageIcon i4    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_4.png");
        ImageIcon i5    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_5.png");
        ImageIcon i6    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_6.png");
        ImageIcon i7    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_7.png");
        ImageIcon i8    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_8.png");
        ImageIcon i9    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_9.png");
        ImageIcon i10    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_10.png");
        ImageIcon i11    = new ImageIcon(PATH_IMG_SMOKE+"smokeFireMissile_11.png");
        
        
        this.img        = i1.getImage();
        
        this.listImg.add(this.img);
        this.listImg.add(i2.getImage());
        this.listImg.add(i3.getImage());
        this.listImg.add(i4.getImage());
        this.listImg.add(i5.getImage());
        this.listImg.add(i6.getImage());
        this.listImg.add(i7.getImage());
        this.listImg.add(i8.getImage());
        this.listImg.add(i9.getImage());
        this.listImg.add(i10.getImage());
        this.listImg.add(i11.getImage());
        
        this.startTimer();
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
}
