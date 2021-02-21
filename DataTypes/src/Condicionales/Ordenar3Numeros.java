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
        
        int temp = 0;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));      
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número diferente a: " + n1));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número diferente a: " + n2 + "  y  " + n1));
        
        // n1 = 3; n2 = 9; n3 = 6;
        // n1 = 6; n2 = 3; n3 = 9;
        // n1 = 9; n2 = 6; n3 = 3;
        
        // n1 = 9; n2 = 6; n3 = 3;
        // n1 = 3; n2 = 9; n3 = 6;
        // n1 = 6; n2 = 3; n3 = 9; *
        
        // n1 = 6; n2 = 3; n3 = 9;
        // n1 = 9; n2 = 6; n3 = 3;
        // n1 = 3; n2 = 9; n3 = 6;
        
        if(n1 > n3){ // 6 9

        }else{
          temp = n1; // 6
          n1 = n3; // 9
          n3 = temp; // 6
        }
        // n1 = 9; n3 = 6; n2 = 3;
        
        if(n1 > n2){ // 9 3

        }else{
          temp = n1;
          n1 = n2;
          n2 = temp;
        }
        // n1 = 9; n3 = 6; n2 = 3;

        if(n2 > n3){ // 3 6
          
        }else{
          temp = n2; // 3
          n2 = n3; // 6
          n3 = temp; // 3
        }
        
        // n1 = 9; n2 = 6; n3 = 3; 
       
        JOptionPane.showMessageDialog(null,
                "You Write: " + n1 + "," + n2 + "," + n3 + "\n");
        
    }
   
}
