/*
 * Class :      ViewVictoryPanel
 * Creation:    Jan 30, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.ModelGame;
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
 * <h1>ViewVictoryPanel</h1>
 * <p>public class ViewVictoryPanel</p>
 *
 * @author Constantin MASSON
 */
public class ViewVictoryPanel extends JPanel implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     Image               background;
    private     Image               title;
    private     String              msg;
    
    private     ViewApplication     parent;
    private     ModelGame           game;
    
    private     ButtonPanel         buttonPanel;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Create a new JPanel for the victory
     * @param pParent 
     * @param pGame Game just done
     */
    public ViewVictoryPanel(ViewApplication pParent, ModelGame pGame){
        this.setLayout(new BorderLayout());
        this.setPreferredSize(DIM_FRAME);
        this.setFocusable(true);
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
        ImageIcon ii            = new ImageIcon(IMG_THEME+"victory.png");
        this.title              = ii.getImage();
        this.msg                = "Congratulation!!! You just killed "//+this.game.getNbAliens()+"!!"
                +"\nYou are a monster!!! Don't you know they had family???\n"
                + "Don't you know they loved eating gherkin and mushroom??\n"
                + "Aie aie aie... So.. what do you want now?\n";
        
        this.buttonPanel        = new ButtonPanel();
        this.add(this.buttonPanel, BorderLayout.SOUTH);
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d  = (Graphics2D)g;
        
        g2d.drawImage(background, 0, 0, this);
        g2d.drawImage(title, 120, 30, title.getWidth(null), title.getHeight(null), this);
        
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
    // Getters - Setters
    //**************************************************************************
    /*
     * Intern class: new button for restart the game
     */
    public class ButtonPanel extends JPanel{
        private     JButton         buttonRestart;
        private     JButton         buttonStop;
        private     ActionListener  actionButtonStart;
        private     ActionListener  actionButtonStop;
        
        
        
        /**
         * Create the button start
         */
        ButtonPanel() {
            this.setOpaque(false);
            this.setLayout(new FlowLayout());
            this.setPreferredSize(new Dimension(250, 100));
            this.initcomponents();
        }
        
        /*
         * Init components
         */
        private void initcomponents(){
            this.buttonRestart      = new JButton("Reload");
            this.buttonStop         = new JButton("Stop slaughter");
            
            this.buttonRestart      .setPreferredSize(new Dimension(150, 50));
            this.buttonStop         .setPreferredSize(new Dimension(150, 50));
            
            this.actionButtonStart  = new ActionButtonStart();
            this.actionButtonStop   = new ActionButtonStop();
            
            this.buttonRestart      .addActionListener(actionButtonStart);
            this.buttonStop         .addActionListener(actionButtonStop);
            
            this.add(this.buttonRestart);
            this.add(this.buttonStop);
        }
        
        public class ActionButtonStart implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                ViewVictoryPanel.this.parent.startGame();
            }
        }
        
        public class ActionButtonStop implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                ViewVictoryPanel.this.parent.returnMenu();
            }
        }
    }
}
