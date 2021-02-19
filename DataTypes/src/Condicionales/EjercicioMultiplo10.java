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
public class EjercicioMultiplo10 {
    public static void main(String[] args){
    
       /*
        Programa que lea numero entero y determine
        si es múltiplo de 10
        */
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita u número y te diré si es múltiplo de 10"));
        
        if((numero % 10) == 0){
            System.out.println("El número si es múltiplo de 10");
            JOptionPane.showMessageDialog(null, "El número si es múltiplo de 10");
        } else {
            System.out.println("EL número no es múltiplo");
            JOptionPane.showMessageDialog(null, "EL número no es múltiplo");
        }
        
    }
    
}
