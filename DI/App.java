package com.company.dependencyInjection;

public class App {

    public static void main(String[] args) {

//        Vehicle raceCar = new Vehicle();
        Vehicle raceCar = new Vehicle(new SmallEngine(100));
        Vehicle raceCar2 = new Vehicle(new LargeEngine(500));
        raceCar.crankIgnition();
        raceCar2.crankIgnition();
    }
}
