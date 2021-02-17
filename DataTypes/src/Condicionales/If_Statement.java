/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author development
 */
public class If_Statement {
    public static void main (String[] args){
        int numero, dato = 5;
        numero = Integer.parseInt( JOptionPane.showInputDialog("Escribe un valor"));
        
        if(numero > 5){
            JOptionPane.showMessageDialog(null, "numero " + numero + " es mayor que " + dato);

            System.out.println("numero " + numero + "es mayor que " + dato);
            
        } else {
            JOptionPane.showMessageDialog(null, "numero " + numero + " es menor o igual que " + dato);
            
            System.out.println("numero " + numero + "es menor o igual que " + dato);
        }
    }
    
}
