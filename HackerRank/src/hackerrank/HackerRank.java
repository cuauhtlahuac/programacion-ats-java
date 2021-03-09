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
        Car tommyCar = new Car(5000, 3000, true, "Tommy", 2);
        System.out.println("tmax: " + tommyCar.getMaxSpeed());
        tommyCar.setMaxSpeed(2063);
        System.out.println("tmax: " + tommyCar.getMaxSpeed());
        tommyCar.upgradeSpeed();
        System.out.println("tmax: " + tommyCar.getMaxSpeed());        

        Car bettysCar = new Car();
        System.out.println("bmax: " + bettysCar.getMaxSpeed());
    }

}
