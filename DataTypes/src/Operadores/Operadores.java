/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import java.util.Scanner;

/**
 *
 * @author development
 */
public class Operadores {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, residuo;
        
        System.out.println("Digita dos numeros");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        residuo = numero1 % numero2;
        
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("mult = " + mult);
        System.out.println("div = " + div);
        System.out.println("residuo = " + residuo);
        
        /* OPERADORES COMBINADOS */
        
        int numero = 10;
        System.out.println("sum: " + (numero += 5));
        System.out.println("rest: " + (numero -= 5));;
        System.out.println("div: " + (numero /= 5));
        System.out.println("multi: " + (numero *= 5));
        System.out.println("Módulo: " + (numero %= 5));
        
        /* INCREMENTOS DECREMENTOS */
        
        int numeroMasMenos = 10;
        
        System.out.println("más uno: " + (++numeroMasMenos));
        System.out.println("menos uno: " + (--numeroMasMenos));
        
        
        
    }
}
