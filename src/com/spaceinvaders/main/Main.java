/*
 * Class :      Main
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.spaceinvaders.main;

import com.spaceinvaders.views.ViewApplication;





/**
 * <h1>Main</h1>
 * <p>public class Main</p>
 *
 * @author Constantin MASSON
 */
public class Main {

    /**
     * Main function
     * Call and display the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EventQueue.invokeLater(new Runnable() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewApplication ap = new ViewApplication();
                ap.setVisible(true);
            }
        });
    }

}
