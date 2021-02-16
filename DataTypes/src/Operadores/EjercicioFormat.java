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
public class EjercicioFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                System.out.println("Write some string");

                String s1=sc.next(); // No spaces
                
                System.out.println("Write a number");                
                int x=sc.nextInt();
                //Complete this line
                String spaces = String.format("%-15s", s1); // Agrega 15 espacios a la derecha a el primer string
                String number = String.format("%03d", x); // Los números menores a tres posiciones se le agregará un cero
                System.out.println("With format:  " + spaces + number);
            }
            
            System.out.println("================================");

    }    
    
}
