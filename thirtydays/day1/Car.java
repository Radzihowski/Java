package com.company.thirtydays.day1;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';

    public void printVariable() {
        System.out.println("This is the max Speed" + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args) {
        Car carry = new Car();
        System.out.println("Family's Car:");
        carry.printVariable();
        Car aliceCar = carry;
        carry.wreckCar();
        aliceCar.printVariable();
    }

}
