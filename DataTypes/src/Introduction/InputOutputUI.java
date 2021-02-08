/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import javax.swing.JOptionPane;

/**
 *
 * @author development
 */
public class InputOutputUI {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char caracter;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite un texto");     
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
        caracter = JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        
        System.out.println("la cadena es: " + cadena);
        System.out.println("el entero es: " + entero);
        System.out.println("el caracter es: " + caracter);
        System.out.println("el decimal es: " + decimal);
        
        JOptionPane.showMessageDialog(null, "la cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "el entero es: " + entero);
        JOptionPane.showMessageDialog(null, "el caracter es: " + caracter);
        JOptionPane.showMessageDialog(null, "el decimal es: " + decimal);
    }
}
