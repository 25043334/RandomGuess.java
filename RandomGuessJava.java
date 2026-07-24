/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.assignment101.randomguess.java;

/**
 *
 * @author ABSALOMs
 */
import javax.swing.JOptionPane;
public class RandomGuessJava {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Think of any number between 1 and 10 !! ");
        JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random()*10)));
        
    }
}
