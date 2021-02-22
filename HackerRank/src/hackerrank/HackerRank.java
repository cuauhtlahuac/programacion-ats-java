/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author development
 */
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // We gonna create a instance of a car in order to called
        
        Car familyCar = new Car();
        familyCar.printVariables();
        
        //Referenced Type, Shared Copy
        Car emilyCar = familyCar;
        emilyCar.upgradeSpeed();
        emilyCar.printVariables();
        
        // Examples of Referenced Type
        
        /*
            -Arrays
            - Queues
            - Linked List
            - Stacks 
                        [ Data Structures ]
        */
        
        
    }
    
}
