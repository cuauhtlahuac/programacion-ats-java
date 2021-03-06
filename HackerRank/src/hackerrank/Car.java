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

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.5; // mileages per gallon

    int numberOfPeopleInCar = 1;
    int maxCarCapacity = 4;

    //    new Constucture: in order to avoid the error and use default values ▼
    public Car() {

    }
    //    new Constucture: in order to avoid the error and use default values ▲

    //    Constucture ▼
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn, String customCarName, int customeMaxCarCapacity) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        nameOfCar = customCarName;
        maxCarCapacity = customeMaxCarCapacity;
    }
    //    Constucture ▲

    /*
        GETTERS AND SETTERS        
     */
    public int getMaxSpeed() {
        return this.maxSpeed; // this refers to the actual object, like tommy car or birthday car
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public char getCarCondition() {
        return this.condition;
    }

    public String getNameOfCar() {
        return this.nameOfCar;
    }

    public double getMaxFuel() {
        return this.maxFuel;
    }

    public double getCurrentFuel() {
        return this.currentFuel;
    }

    public double getMPG() {
        return this.mpg;
    }

    public int getNumberOfPeopleInCar() {
        return this.numberOfPeopleInCar;
    }
    
    public void setNumberOfPeopleInCar(int newNumberOfPeopleInCar) {
        this.numberOfPeopleInCar = newNumberOfPeopleInCar;
    }

    public int getmaxCarCapacity() {
        return this.maxCarCapacity;
    }

    public void printVariables() { // Public is the scope of the funcion, viod = return nothing
        System.out.println("Max Speed:" + maxSpeed);
        System.out.println("min Speed: " + minSpeed);
        System.out.println("Weight: " + weight);
        System.out.println("Is the car on? : " + isTheCarOn);
        System.out.println("Car condition: " + condition);
        System.out.println("Name of the car: " + nameOfCar);
        System.out.println("Number of people in the car:  " + numberOfPeopleInCar);
        System.out.println("\n");
    }

    public void upgradeSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }

    public void getIn() {
        if (getNumberOfPeopleInCar() < getmaxCarCapacity()) {
            setNumberOfPeopleInCar(getNumberOfPeopleInCar() + 1);
            System.out.println("Someone got in");
        } else {
            System.out.println("The Car is full! " + numberOfPeopleInCar + " = " + maxCarCapacity);
        }
    }

    public void getOut() {
        if (getNumberOfPeopleInCar() > 0) {
            setNumberOfPeopleInCar(getNumberOfPeopleInCar() - 1);
            System.out.println("Someone left the car");
        } else {
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }

    public double howManyMillesTillOutOfgas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnoTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on: " + isTheCarOn);
        }
    }

    public static void main(String[] args) {
        System.out.println("I gonna print in the HackerRank class, but this print won't be show out.");

    }

}
