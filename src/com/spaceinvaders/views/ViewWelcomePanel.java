/*
 * Class :      ViewWelcomePanel
 * Creation:    Jan 28, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.tools.SoundEffect;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;





/**
 * <h1>ViewWelcomePanel</h1>
 * <p>
 * public class ViewWelcomePanel<br/>
 * extends JPanel<br/>
 * implements Commons
 * </p>
 * 
 * <p>This is the welcome page displayed when user start the game</p>
 *
 * @author Constantin MASSON
 */
public class ViewWelcomePanel extends JPanel implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Image               imgAlien1;
    private     Image               imgAlien2;
    private     Image               imgAlien3;
    
    private     Image               background;
    private     Image               title;
    private     ModePanel           modePanel;
    
    private     int                 alien1PosX;
    private     int                 alien1PosY;
    private     int                 alien2PosX;
    private     int                 alien2PosY;
    private     int                 alien3PosX;
    private     int                 alien3PosY;
    
    private     ViewApplication     parent;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new ViewPanelWelcome
     * @param pParent
     */
    public ViewWelcomePanel(ViewApplication pParent){
        this.setLayout(new BorderLayout());
        this.setPreferredSize(DIM_FRAME);
        this.setDoubleBuffered(true);
        this.parent = pParent;
        
        this.initComponents();
        
        this.modePanel  = new ModePanel();
        this.add(this.modePanel, BorderLayout.SOUTH);
        
        SoundEffect.WELCOME.play();
    }
    
    /**
     * Create the components
     */
    private void initComponents(){
        ImageIcon i             = new ImageIcon(IMG_THEME+"background.png");
        ImageIcon i2            = new ImageIcon(PATH_ALIENS_IMG+"alien1_pos2.png");
        ImageIcon i3            = new ImageIcon(PATH_ALIENS_IMG+"alien2_pos2.png");
        ImageIcon i4            = new ImageIcon(PATH_ALIENS_IMG+"alien3_pos2.png");
        ImageIcon i5            = new ImageIcon(IMG_THEME+"title.png");
        
        this.background         = i.getImage();
        this.imgAlien1          = i2.getImage();
        this.imgAlien2          = i3.getImage();
        this.imgAlien3          = i4.getImage();
        this.title              = i5.getImage();
        
        this.alien1PosX         = 200-(this.imgAlien1.getWidth(null)/2);
        this.alien1PosY         = 150;
        
        this.alien2PosX         = 200-(this.imgAlien2.getWidth(null)/2);
        this.alien2PosY         = 200;
        
        this.alien3PosX         = 200-(this.imgAlien3.getWidth(null)/2);
        this.alien3PosY         = 250;
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d  = (Graphics2D)g;
        
        g2d.drawImage(background, 0, 0, this);
        g2d.drawImage(title, 20, 20, title.getWidth(null), title.getHeight(null), this);
        g2d.drawImage(this.imgAlien1, alien1PosX, alien1PosY, this);
        g2d.drawImage(this.imgAlien2, alien2PosX, alien2PosY, this);
        g2d.drawImage(this.imgAlien3, alien3PosX, alien3PosY, this);
        
        Font f = new Font("Arial", Font.BOLD, 25);
        g2d.setFont(f);
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawString(" = 40 Points", 250, alien1PosY+25);
        g2d.drawString(" = 20 Points", 250, alien2PosY+25);
        g2d.drawString(" = 10 Points", 250, alien3PosY+25);
    }
    
    
    
    
    
    //**************************************************************************
    // Intern class
    //**************************************************************************
    /*
     * Intern class: new button for restart the game
     */
    public class ModePanel extends JPanel{
        private     JButton         buttonWeak;
        private     JButton         buttonNormal;
        private     JButton         buttonhardcore;
        
        
        
        /**
         * Create the button start
         */
        public ModePanel() {
            this.setOpaque(false);
            this.setLayout(new FlowLayout());
            this.setPreferredSize(new Dimension(250, 100));
            this.initcomponents();
        }
        
        /*
         * Init components
         */
        private void initcomponents(){
            this.buttonWeak         = new JButton("For the Weaks");
            this.buttonNormal       = new JButton("Normal");
            this.buttonhardcore     = new JButton("Hardcore");
            
            this.buttonWeak         .setPreferredSize(new Dimension(150, 50));
            this.buttonNormal       .setPreferredSize(new Dimension(150, 50));
            this.buttonhardcore     .setPreferredSize(new Dimension(150, 50));
            
            ActionButtonWeak        mode1 = new ActionButtonWeak();
            ActionButtonNormal      mode2 = new ActionButtonNormal();
            ActionButtonhardCore    mode3 = new ActionButtonhardCore();
            
            
            this.buttonWeak         .addActionListener(mode1);
            this.buttonNormal       .addActionListener(mode2);
            this.buttonhardcore     .addActionListener(mode3);
            
            
            this.add(this.buttonWeak);
            this.add(this.buttonNormal);
            this.add(this.buttonhardcore);
        }
        
        public class ActionButtonWeak implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                parent.startGame(MODE_WEAK);
            }
        }
        
        public class ActionButtonNormal implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                parent.startGame(MODE_NORMAL);
            }
        }
        public class ActionButtonhardCore implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                parent.startGame(MODE_HARDCORE);
            }
        }
    }
}
