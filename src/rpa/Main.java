/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpa;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Dan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana lienzo = new Ventana();
        JFrame mainVentana = new JFrame("Menu sample");
        mainVentana.setLayout(new BorderLayout());
        mainVentana.add(lienzo);
        mainVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainVentana.setVisible(true);
        mainVentana.pack();
        
}
}