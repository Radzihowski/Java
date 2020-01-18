package com.company;

public class Main {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4000.79;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    public void printVariables() {
        System.out.println("This is the max speed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
//
//    public void wreckCar() {
//        condition = 'C';
//    }
//
//    public static void main(String[] args) {
//        Main familyCar = new Main();
//        System.out.println("Family's Car");
//        familyCar.printVariables();
//        Main alliceCar = familyCar;
//        familyCar.wreckCar();
//        System.out.println("Alice's Car:");
//        alliceCar.printVariables();
//	}
//next task. adding other details
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {
        Main familyCar = new Main();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        familyCar.upgradeMinSpeed();
        familyCar.printVariables();
    }
}
