/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleAddition;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author development
 */
public class SimpleAddition {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Insert a number");
            int n1 = Integer.parseInt(br.readLine());
            
            System.out.println("Insert a number");            
            int n2 = Integer.parseInt(br.readLine());

            System.out.println("Insert a number");
            int n3 = Integer.parseInt(br.readLine());

            System.out.println("Insert a number");
            int n4 = Integer.parseInt(br.readLine());

            System.out.println("Insert a number");
            int n5 = Integer.parseInt(br.readLine());

            System.out.println("Insert a number");
            int n6 = Integer.parseInt(br.readLine());

            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
