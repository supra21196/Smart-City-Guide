/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.java;

import Main.java.Database.Database;
/**
 *
 * @author sukhadapradhan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database.OpenDataBase();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new background().setVisible(true);
            }
        });
    }
    
}
