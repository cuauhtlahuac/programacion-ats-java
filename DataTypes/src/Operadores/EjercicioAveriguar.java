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
public class EjercicioAveriguar {
    public static void main(String[] args){
        /* 
            Memo N Dollars, Luis tiene la mitad de Memo.
            Juan tiene La mitad de Luis y Memo juntos.
            Imprimir total de los 3.
        */
        
        float total, memo, luis, juan;
        System.out.println("Cuantos dolares tiene Memo?");
        Scanner dollars = new Scanner(System.in);
        
        memo = dollars.nextFloat();
        
        luis = memo / 2;
        
        juan = (luis + memo) / 2;
        
        total = luis + memo + juan;
                
        System.out.println("Los tres tienen en total: " + total);
    }
    
}
