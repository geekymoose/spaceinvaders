/*
 * Class :      ViewGameOverPanel
 * Creation:    Jan 30, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.GameModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;





/**
 * <h1>ViewGameOverPanel</h1>
 * <p>
 * public class ViewGameOverPanel<br/>
 * extends JPanel<br/>
 * implements Commons, KeyListener
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewGameOverPanel extends JPanel implements Commons, KeyListener{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Image               background;
    private     Image               title;
    private     String              msg;
    
    private     ViewApplication     parent;
    private     GameModel           game;
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new JPanel for the victory
     * @param pParent 
     * @param pGame Game just done
     */
    public ViewGameOverPanel(ViewApplication pParent, GameModel pGame){
        this.setPreferredSize(DIM_FRAME);
        this.setFocusable(true);
        this.setDoubleBuffered(true);
        
        this.parent = pParent;
        this.game   = pGame;
        
        this.initComponents();
        this.addKeyListener(this);
    }
    
    
    /**
     * Create the components
     */
    private void initComponents(){
        ImageIcon i             = new ImageIcon(IMG_THEME+"background.png");
        this.background         = i.getImage();
        ImageIcon ii            = new ImageIcon(IMG_THEME+"gameOver.png");
        this.title              = ii.getImage();
        this.msg                = "Ooooh my god!!!! You so bad!!!\n"
                                    + "Are you afraid by a little teddy space invaders?\n"
                                    + "Hum... Try again!! (Or get out and eat a rabbit)";
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d  = (Graphics2D)g;
        
        g2d.drawImage(background, 0, 0, this);
        g2d.drawImage(title, 15, 30, title.getWidth(null), title.getHeight(null), this);
        
        Font f2 = new Font("Arial", Font.BOLD, 15);
        g2d.setFont(f2);
        g2d.setColor(Color.LIGHT_GRAY);
        this.drawString(g, this.msg, 75, 200);
        
        g2d.drawString("Press space to start the game", 75, 300);
    }
    
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Used to create a text area from a string separated by \n values
     * @param g
     * @param pText
     * @param pX
     * @param pY 
     */
    private void drawString(Graphics g, String pText, int pX, int pY) {
        for (String line : pText.split("\n"))
            g.drawString(line, pX, pY += g.getFontMetrics().getHeight());
    }
    
    
    
    
    
    //**************************************************************************
    // Key Listener
    //**************************************************************************
    @Override
    public void keyTyped(KeyEvent e){
    
    }
    
    @Override
    public void keyPressed(KeyEvent e){
    
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE) {
            this.parent.returnMenu();
            try {
                this.finalize();
            } catch(Throwable ex) { 
                //Nothing
            }
        }
    }
}
