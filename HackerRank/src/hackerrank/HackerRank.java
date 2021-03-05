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
        System.out.println("Family Car v1: \n----------");
        Car familyCar = new Car(50, 5000.256, false, "Family Car");
        familyCar.getIn();
        familyCar.getIn();
        familyCar.getIn();
        System.out.println("Miles left: " + familyCar.howManyMillesTillOutOfgas());
        System.out.println("Max Miles: " + familyCar.maxMilesPerFillUp());
        familyCar.printVariables();
        
        System.out.println("Family Car V2: \n----------");
        familyCar.printVariables();
        familyCar.getOut();
        
        System.out.println("Family Car V3: \n----------");
        familyCar.turnoTheCarOn();
        familyCar.printVariables();
        
    }
    
}
