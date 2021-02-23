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
public class DeterminarFecha {

    /* 
    Pedir dia mes y año y determinar si la fecha es correcta
    Suponiendo meses de 30 días
     */
    int dia, mes, año;

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe día"));

        if (!(dia > 0 && dia <= 30)) {
            JOptionPane.showMessageDialog(null, "El día es incorrecto F");
        } else {
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Escribe mes"));

            if (!(mes > 0 && mes <= 12)) {
                JOptionPane.showMessageDialog(null, "El mes es incorrecto");
            } else {

                int año = Integer.parseInt(JOptionPane.showInputDialog("Escribe año"));

                if (año == 0) {
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");

                } else {
                    JOptionPane.showMessageDialog(null, "La fecha es correcta: " + dia + "/" + mes + "/"  + año);
                }
            }

        }

    }

}
