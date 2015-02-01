/* 
 * Class :      ViewApplication
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.views;

import com.spaceinvaders.constants.Commons;
import com.spaceinvaders.models.GameModel;
import com.spaceinvaders.tools.SoundEffect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;





/**
 * <h1>ViewApplication</h1>
 * <p>
 * public class ViewApplication<br/>
 * extends JFrame<br/>
 * implements Commons
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewApplication extends JFrame implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    private     JPanel                  mainContent;
    
    //Menu bar
    private     JMenuBar                menuBar;
    
    private     JMenu                   file;
    private     JMenuItem               file_close;
    
    private     JMenu                   option;
    private     JMenu                   option_sound;
    private     JRadioButtonMenuItem    options_soundOn;
    private     JRadioButtonMenuItem    options_soundOff;
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Start the application
     * Create the JPanel and initialize the listener
     * Also call for toolBar function and left Panel creation
     */
    public ViewApplication(){
        this.setTitle("Space invaders");
        this.setMinimumSize(DIM_FRAME_MIN); //No resize: not actually useful
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();
        this.initMenu();
        this.initMenuKeyBinding();
    }
    
    
    /*
     * Initialize JPanel components used by the program
     */
    private void initComponents(){
        this.mainContent = new ViewWelcomePanel(this);
        this.getContentPane().add(this.mainContent);
        SoundEffect.init(); //Load sounds
    }
    
    /*
     * Create the menu
     */
    private void initMenu(){
        this.menuBar            = new JMenuBar();
        
        //Menu File
        this.file               = new JMenu("File");
        this.file_close         = new JMenuItem("Close");
        this.file_close.addActionListener(new CloseListener());
        this.file.add(this.file_close);
        
        //Menu Options
        this.option             = new JMenu("Options");
        this.option_sound       = new JMenu("Sound");
        this.options_soundOn    = new JRadioButtonMenuItem("on");
        this.options_soundOff   = new JRadioButtonMenuItem("off");
        
        ButtonGroup soundGroup  = new ButtonGroup();
        soundGroup.add(options_soundOn);
        soundGroup.add(options_soundOff);
        SoundListener soundListener = new SoundListener(); 
        options_soundOn.addActionListener(soundListener);
        options_soundOff.addActionListener(soundListener);
        
        options_soundOn.setSelected(true);
        
        this.option_sound.add(options_soundOn);
        this.option_sound.add(options_soundOff);
        this.option.add(option_sound);
        
        //Create the general menu with each JMenu
        this.menuBar.add(file);
        this.menuBar.add(option);
        this.setJMenuBar(menuBar);
    }
    
    /*
     * Create keyBinding for the menu
     */
    private void initMenuKeyBinding(){
        this.file.setMnemonic('f');
        this.option.setMnemonic('o');
        this.options_soundOn.setAccelerator(KeyStroke.getKeyStroke('m'));
        this.options_soundOff.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK));
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Display the menu page
     */
    public void returnMenu(){
        this.getContentPane().removeAll();
        this.mainContent = new ViewWelcomePanel(this);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * Start the game
     * Close welcome page and display the game one
     * @param pMode game mode
     */
    public void startGame(int pMode){
        this.getContentPane().removeAll();
        this.mainContent = new ViewGamePanel(this, pMode);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Display victory panel after closing the current one (The game)
     * @param game Game just finished
     */
    public void displayVictory(GameModel game){
        this.getContentPane().removeAll();
        this.mainContent = new ViewVictoryPanel(this, game);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Display the game over panel
     * @param game Game just finished
     */
    public void displayGameOver(GameModel game){
        this.getContentPane().removeAll();
        this.mainContent = new ViewGameOverPanel(this, game);
        this.getContentPane().add(this.mainContent);
        this.getContentPane().revalidate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    
    
    
    

    //**************************************************************************
    // Menu Listener and actions
    //**************************************************************************
    /*
     * Intern class for close button
     */
    private class CloseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane confirm = new JOptionPane();
            int choice;
            choice = confirm.showConfirmDialog(null,
                    "Sure? You want to leave?",
                    "Noooo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.ERROR_MESSAGE);
            if(choice == JOptionPane.OK_OPTION){
                System.exit(0);
            }
        }
    }
    
    /*
     * Intern class for the soundListener
     */
    private class SoundListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(options_soundOn.isSelected()){
                SoundEffect.volume = SoundEffect.Volume.ON;
            } else {
                SoundEffect.volume = SoundEffect.Volume.MUTE;
            }
        }
    }
}
