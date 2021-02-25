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
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy"; // Double quotes in Referenced Type String
      
    /*
        For create a variable we need:
        1.- Declare
        2.- Allocate
        3.- Initialize
    */
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.5; // mileages per gallon
    
    int numberOfPeopleInCar = 1;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) { // This is a Constucture
        maxSpeed  = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    public void printVariables(){ // Public is the scope of the funcion, viod = return nothing
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void upgradeSpeed(){
        minSpeed = maxSpeed;
        maxSpeed += 1;
    }
    
    
    public static void main(String[] args){
        System.out.println("I gonna print in the HackerRank class, but this print won't be show out.");
        
    }
    
}
