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
        System.out.println("Family Car: \n----------");
        Car familyCar = new Car(50, 5000.256, true, "Family Car");
        familyCar.getIn();
        familyCar.printVariables();

        System.out.println("My Car: \n------------");        
        Car myCar = new Car(65, 2000.98, false, "Rokus Car");
        myCar.printVariables();
        
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
