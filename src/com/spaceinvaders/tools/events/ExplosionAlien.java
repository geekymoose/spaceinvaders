/*
 * Class :      ExplosionAlien
 * Creation:    Jan 24, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools.events;

import com.spaceinvaders.models.ModelGame;
import java.awt.Point;
import javax.swing.ImageIcon;





/**
 * <h1>ExplosionAlien</h1>
 * <p>
 * public class ExplosionAlien<br/>
 * extends DynamicEvent
 * </p>
 *
 * @author Constantin MASSON
 */
public class ExplosionAlien extends DynamicEvent{
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new explosion for alien
     * @param pCenter Center position
     * @param pModel model map where explosion is 
     */
    public ExplosionAlien(Point pCenter, ModelGame pModel){
        super(pCenter, DELAY_EXPLOSION, pModel);
        
        ImageIcon i1    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion1.png");
        ImageIcon i2    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion2.png");
        ImageIcon i3    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion3.png");
        ImageIcon i4    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion4.png");
        ImageIcon i5    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion5.png");
        ImageIcon i6    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion6.png");
        ImageIcon i7    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion7.png");
        ImageIcon i8    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion8.png");
        ImageIcon i9    = new ImageIcon(PATH_IMG_EXPLOSION+"explosion9.png");
        ImageIcon i10   = new ImageIcon(PATH_IMG_EXPLOSION+"explosion10.png");
        ImageIcon i11   = new ImageIcon(PATH_IMG_EXPLOSION+"explosion11.png");
        ImageIcon i12   = new ImageIcon(PATH_IMG_EXPLOSION+"explosion12.png");
        
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
        this.listImg.add(i12.getImage());
        
        this.startTimer();
    }
}
