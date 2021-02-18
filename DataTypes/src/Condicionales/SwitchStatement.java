package Condicionales;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author development
 */
public class SwitchStatement {
    public static void main (String[] args){
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 y 3"));
        
        switch(dato) {
           case 1: JOptionPane.showMessageDialog(null, "Digitaste el número 1");
           break;
           case 2: JOptionPane.showMessageDialog(null, "Digitaste el número 2");
           break;           
           case 3: JOptionPane.showMessageDialog(null, "Digitaste el número 3");
           break;           
           default: JOptionPane.showMessageDialog(null, "Digitaste un número diferente al rango: " + dato);
            
        }
    }
}
