/*
 * Class :      ViewToolsBar
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.views;

import com.constants.DimView;
import com.constants.Paths;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;





/**
 * <h1>ViewToolsBar</h1>
 * <p>
 public class ViewToolsBar<br/>
 * extends JPanel<br/>
 * implements Paths, DimView
 * </p>
 *
 * @author Constantin MASSON
 */
public class ViewToolsBar extends JPanel implements Paths, DimView{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    //Buttons and tools bar
    private     JButton                 buttonStart;
    private     JButton                 buttonStop;
    private     JButton                 buttonRestart;
    private     JButton                 buttonSave;
    private     JButton                 buttonLoad;
    
    //Listener for buttons
    private     ButtonStartListener     buttonStartListener;
    private     ButtonStopListener      buttonStopListener;
    private     ButtonRestartListener   buttonRestartListener;
    private     ButtonSaveListener      buttonSaveListener;
    private     ButtonLoadListener      buttonLoadListener;
    
    
    
    
    

    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /*
     * Create the tools bar
     */
    public ViewToolsBar(){
        this.initButtons();
    }
    
    
    /*
     * Create all the buttons
     */
    private void initButtons(){
        this.buttonStart    = new JButton(new ImageIcon(PATH_ICON_TOOLS+"start.png"));
        this.buttonStop     = new JButton(new ImageIcon(PATH_ICON_TOOLS+"stop.png"));
        this.buttonRestart  = new JButton(new ImageIcon(PATH_ICON_TOOLS+"restart.png"));
        this.buttonSave     = new JButton(new ImageIcon(PATH_ICON_TOOLS+"save.png"));
        this.buttonLoad     = new JButton(new ImageIcon(PATH_ICON_TOOLS+"load.png"));
        
        this.buttonStart    .addActionListener(buttonStartListener);
        this.buttonStop     .addActionListener(buttonStopListener);
        this.buttonRestart  .addActionListener(buttonRestartListener);
        this.buttonSave     .addActionListener(buttonSaveListener);
        this.buttonLoad     .addActionListener(buttonLoadListener);
        
        this.buttonStart    .setPreferredSize(DIM_ICON_TOOLS);
        this.buttonStop     .setPreferredSize(DIM_ICON_TOOLS);
        this.buttonRestart  .setPreferredSize(DIM_ICON_TOOLS);
        this.buttonSave     .setPreferredSize(DIM_ICON_TOOLS);
        this.buttonLoad     .setPreferredSize(DIM_ICON_TOOLS);
        
        this.add(this.buttonStart);
        this.add(this.buttonStop);
        this.add(this.buttonRestart);
        this.add(this.buttonSave);
        this.add(this.buttonLoad);
    }
    
    
    
    
    

    //**************************************************************************
    // Functions
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // Getters - Setters
    //**************************************************************************
    
    
    
    
    

    //**************************************************************************
    // class intern ActionListener for buttons
    //**************************************************************************
    private class ButtonStartListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        }
    }
    
    private class ButtonStopListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
    
    private class ButtonRestartListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
    
    private class ButtonSaveListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
    
    private class ButtonLoadListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
        }
    }
}
