/*
 * Class :      Main
 * Creation:    Jan 19, 2015
 * Author :     Constantin MASSON
 * 
 */

package com.main;

import com.views.Application;
import java.awt.EventQueue;





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
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ap = new Application();
                ap.setVisible(true);
            }
        });
    }

}
