/*
 * Class :      SoundEffect
 * Creation:    Feb 1, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.tools;

import com.spaceinvaders.constants.Commons;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.sound.sampled.*;
import javax.sound.sampled.Clip;





/**
 * <h1>SoundEffect</h1>
 * <p>
 * public enum SoundEffect<br/>
 * implements Commons
 * </p>
 * 
 * <p>This enum encapsulates every sound used for the game</p>
 *
 * @author Constantin MASSON
 * @date Feb 1, 2015
 */
public enum SoundEffect implements Commons{
    //**************************************************************************
    // Constants - Variables
    //**************************************************************************
    SHOOT("shoot.wav"),
    EXPLOSION("explosion.wav"),
    INVADER_KILLED("invaderKilled.wav"),
    GAME_OVER("gameOver.wav"),
    VICTORY("victory1.wav", "victory2.wav", "victory3.wav", "victory4.wav"),
    FIRE_LOOSE("fireLoose.wav"),
    START("start.wav"),
    STOP("stop.wav"),
    WELCOME("welcome.wav"),
    INVADER_MOVE("invaderMove.wav");
    
    private ArrayList<Clip> listClip = new ArrayList();
    public static Volume volume = Volume.ON;
    
    /**
     * Enum for volume management
     * MUTE:    sound OFF
     * ON:      sound ON
     */
    public static enum Volume{
        MUTE, ON
    }
    
    
    
    
    
    //**************************************************************************
    // Constructor - Initialization
    //**************************************************************************
    /**
     * Initialize every sounds
     */
    public static void init(){
        values();
    }
    
    
    /**
     * Create one sound
     * @param pSoundFileNames list of file to open
     */
    SoundEffect(String... pSoundFileNames){
        for(int k=0; k<pSoundFileNames.length; k++){
            URL url = this.getClass().getResource(PATH_SOUNDS+pSoundFileNames[k]);
            try {
                AudioInputStream audioInputStrean = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStrean);
                this.listClip.add(clip);
            } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                //Do something?
            }
        }
    }
    
    
    
    
    
    //**************************************************************************
    // Functions
    //**************************************************************************
    /**
     * Play the song
     * If already running, will stop it and restart
     */
    public void play(){
        if(volume == Volume.MUTE){
            return;
        }
        for(Clip clip : this.listClip){
            if(clip.isRunning()){
                clip.stop();
            }
            clip.setFramePosition(0);
            clip.start();
        }
    }
    
    /**
     * Stop running the song
     */
    public void stop(){
        for(Clip clip : this.listClip){
            clip.stop();
        }
    }
}
