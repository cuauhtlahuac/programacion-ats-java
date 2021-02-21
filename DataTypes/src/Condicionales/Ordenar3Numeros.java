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
public class Ordenar3Numeros {
    public static void main(String[] args){
        int n1, n2, n3;
        
        int mayor = 0, medio = 0, menor = 0;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));      
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número diferente a: " + n1));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número diferente a: " + n2 + "  y  " + n1));
        
        if(n1 > n2 && n2 > n3){
            mayor = n1; medio = n2; menor = n3;
        }
        if(n1 > n3 && n3 > n2){
            mayor = n1; medio = n3; menor = n2;
        }
        
        if(n2 > n1 && n1 > n3){
            mayor = n2; medio = n1; menor = n3;
        }
        if(n2 > n3 && n3 > n1){
            mayor = n2; medio = n3; menor = n1;
        }
        
        if(n3 > n2 && n2 > n1){
            mayor = n3; medio = n2; menor = n1;
        }        
        if(n3 > n1 && n1 > n2){
            mayor = n3; medio = n1; menor = n2;
        }
        
       
        JOptionPane.showMessageDialog(null,
                "You Write: " + n1 + "," + n2 + "," + n3 + "\n" + 
                "Mayor: " + mayor + " Medio: " + medio + " Menor: " + menor );
    }
}
