package com.company;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 15;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car() {

    }

    public Car (int customMinSpeed, int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        minSpeed = customMinSpeed;
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        // if there aren't too many people in the car
        if ( numberOfPeopleInCar < maxNumberOfPeopleInCar ) {
            // then someone can get in
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else {
            // otherwise print out the fact the car is full
            System.out.println("The car is full! " + numberOfPeopleInCar + "=" + maxNumberOfPeopleInCar);
        }
    }

    public void getOut() {
//        numberOfPeopleInCar = numberOfPeopleInCar - 1;
        // if there's people in the car
        if (numberOfPeopleInCar > 0) {
            // then tell one of the person get out
            numberOfPeopleInCar--;
        } else {
            // otherwise no one can get out and we'll print that
            System.out.println("No one is in the car");
        }
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public void turnTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on " + isTheCarOn);
        }
    }

    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();

    }

//    public static void  main(String[] args) {
//        System.out.println("Birthday Car");
//        Car birthdayPresent = new Car(1, 150, 5000.545, true);
//        birthdayPresent.printVariables();
//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(1, 250, 2600,false);
//        christmasPresent.printVariables();

//        Car birthdayPresent = new Car(1, 150, 5000.545, true);
//        System.out.println("Birthday Car v1");
//        birthdayPresent.printVariables();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        birthdayPresent.getIn();
//        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
//        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
//        System.out.println("Birthday Car v2");
//        birthdayPresent.printVariables();
//        birthdayPresent.getOut();
//        System.out.println("Birthday Car v2");
//        birthdayPresent.printVariables();
}


