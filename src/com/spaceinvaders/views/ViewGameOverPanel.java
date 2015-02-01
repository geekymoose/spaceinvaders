/*
 * Class :      ViewGameOverPanel
 * Creation:    Jan 30, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.GameModel;
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
 * <h1>ViewGameOverPanel</h1>
 * <p>
 * public class ViewGameOverPanel<br/>
 * extends JPanel<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewGameOverPanel extends JPanel implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Image               background;
    private     Image               title;
    private     String              msg;
    private     ButtonPanel         panButton;
    
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
        this.setLayout(new BorderLayout());
        this.setPreferredSize(DIM_FRAME);
        this.setDoubleBuffered(true);
        
        this.parent = pParent;
        this.game   = pGame;
        
        this.initComponents();
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
        
        this.panButton        = new ButtonPanel();
        this.add(this.panButton, BorderLayout.SOUTH);
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
    // Intern class
    //**************************************************************************
    /*
     * Intern class: new button for restart the game
     */
    public class ButtonPanel extends JPanel{
        private     JButton         buttonRestart;
        private     JButton         buttonMenu;
        private     ActionListener  actionButtonRestart;
        private     ActionListener  actionButtonMenu;
        
        
        
        /**
         * Create the button start
         */
        public ButtonPanel() {
            this.setOpaque(false);
            this.setLayout(new FlowLayout());
            this.setPreferredSize(new Dimension(250, 100));
            this.initcomponents();
        }
        
        /*
         * Init components
         */
        private void initcomponents(){
            this.buttonRestart      = new JButton("Retry");
            this.buttonMenu         = new JButton("Return menu");
            
            this.buttonRestart      .setPreferredSize(new Dimension(150, 50));
            this.buttonMenu         .setPreferredSize(new Dimension(150, 50));
            
            this.actionButtonRestart= new ActionButtonRestart();
            this.actionButtonMenu   = new ActionButtonMenu();
            
            this.buttonRestart      .addActionListener(actionButtonRestart);
            this.buttonMenu         .addActionListener(actionButtonMenu);
            
            this.add(this.buttonRestart);
            this.add(this.buttonMenu);
        }
        
        public class ActionButtonRestart implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                SoundEffect.GAME_OVER.stop();
                ViewGameOverPanel.this.parent.startGame(game.getMode());
            }
        }
        
        public class ActionButtonMenu implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                SoundEffect.GAME_OVER.stop();
                ViewGameOverPanel.this.parent.returnMenu();
            }
        }
    }
}
