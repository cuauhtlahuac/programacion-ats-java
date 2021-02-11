package Operadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author development
 */
public class ClaseMath {
    public static void main(String[] args){
        //double raiz = Math.sqrt(9); // Si le pones int marca error
        int raiz = (int)Math.sqrt(9); // Lo hakeamos transformandolo a (int)
        // Potencia
        double base = 5.26, exponente = 7;
        double potencia = Math.pow(base, exponente);
        
        long numRedondo = Math.round(potencia);
        
        double aleatorio = Math.random();
        
        System.out.println("raiz: " + raiz);
        System.out.println("potencia: " + potencia);
        System.out.println("redondeado: " + numRedondo);
        System.out.println("aleatorio: " + aleatorio);
    }
}
