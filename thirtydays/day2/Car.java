package com.company.thirtydays.day2;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariable() {
        System.out.println("This is the max Speed" + maxSpeed);
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
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000.545, true );
        System.out.println("Birthday car v1: ");
        birthdayPresent.printVariable();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles:" + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday car v2: ");
        birthdayPresent.printVariable();
        birthdayPresent.getOut();
        System.out.println("Birthday car v3: ");
        birthdayPresent.printVariable();



//        System.out.println("Christmas car: ");
//        Spam.Car christmasPresent = new Spam.Car( 550, 2000, false);
//        christmasPresent.printVariable();

    }

}
