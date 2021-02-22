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
    
    public void printVariables(){ // Public is the scope of the funcion, viod = return nothing
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }
    
    public void wreckCar(){
        condition = 'C';
    }
    
    
    public static void main(String[] args){
        System.out.println("I gonna print in the HackerRank class, but this print won't be show out.");
        
    }
    
}
