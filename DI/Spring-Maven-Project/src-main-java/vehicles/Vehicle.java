package vehicles;

import parts.Engine;

public class Vehicle {

//    Engine racingEngine = new LargeEngine(500);
    // the Vehicle will always be a 500 hp one, which is a bad design!

    private Engine myEngine;
    public Vehicle(Engine engine) { // Dependency Injection.
        myEngine = engine;
    }

    public void crankIgnition() {
//        racingEngine.startEngine();
        myEngine.startEngine();
        System.out.println("vehicle is running.");
    }
}
