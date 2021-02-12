/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author development
 */
public class CalcularSuma {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        float firstNumber, secondNumber, thirdNumber, total;
        
        firstNumber = Float.parseFloat( JOptionPane.showInputDialog("Escribe un numero") );
        secondNumber = Float.parseFloat( JOptionPane.showInputDialog("Escribe otro numero") );
        thirdNumber = Float.parseFloat( JOptionPane.showInputDialog("Escribe el último") );
        
        total = firstNumber + secondNumber + thirdNumber; 
        
        JOptionPane.showConfirmDialog(null ,"La suma total es: " + total);
    }
    
}
