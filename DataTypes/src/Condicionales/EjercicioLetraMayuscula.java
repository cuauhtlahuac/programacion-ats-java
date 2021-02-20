/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author development
 */
public class EjercicioLetraMayuscula {
    public static void main(String[] args){
        boolean b1 = Character.isUpperCase(JOptionPane.showInputDialog("Escribe una letra").charAt(0));
        if(b1){
            JOptionPane.showMessageDialog(null, "Es Mayúscula");
        }else{
            JOptionPane.showMessageDialog(null, "No es Mayúscula");
        }
        
    }
    
}
