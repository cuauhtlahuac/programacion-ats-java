/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author development
 */
public class InputAndOutput {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite un número entero");
        numero = entrada.nextInt();
        System.out.println("El numero escrito es: " + numero);
        
        float decimal;
        System.out.println("Escriba un numero decimal");
        decimal = entrada.nextFloat();
        System.out.println("El decimal escrito es: " + decimal);
        
        double doble;
        System.out.println("Escribe un numero grande decimal");
        doble = entrada.nextDouble();
        System.out.println("El número grande es: " + doble);
        
        Scanner entradaTexto = new Scanner(System.in);
        
        String cadena;
        System.out.println("Escibe un poema");
        // cadena = entrada.next(); * next solo no me guarda la cadena a full
        cadena = entradaTexto.nextLine();// Para guardar toda la cadena        
        System.out.println("El poema es: " + cadena);
        
        char caracter;        
        System.out.println("Escribe un caracter, de todas formas solo guardaré la primer letra");
        caracter = entradaTexto.next().charAt(0);
        System.out.println("El caracater es: " + caracter);
        
    }
    
}
