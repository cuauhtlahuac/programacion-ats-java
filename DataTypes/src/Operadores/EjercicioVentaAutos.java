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
public class EjercicioVentaAutos {
    public static void main(String[] params){
        /*
            Compañía autos usados paga a personal de ventas
        un salario de $1000 mensuales, mas $150 comisión x c/auto
        más el 5% del valor de la venta por carro.
        Hacer programa que calcule e imprima salario mensual del vendedor.
        
        */
        
        float vendedor, salario = 1000, comision = 150, comisionValorAuto = 5;
        
        Scanner entrada = new Scanner(System.in);

        float valorDelAuto = 100_000;
        
        System.out.println("Cuantos autos vendió al mes el vendedor?");
        int autos = entrada.nextInt();
        
        float valorVenta  = (valorDelAuto * comisionValorAuto) / 100;
        
        vendedor = salario + ((comision + valorVenta) * autos);
        
        System.out.println("El vendedor Ganó en el mes: " + vendedor);
        
    }
    
}
