package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import parts.LargeEngine;
import parts.SmallEngine;
import vehicles.Vehicle;

public class App {

    public static void main(String[] args) {

//        Vehicle raceCar = new Vehicle();
        /*
        Vehicle raceCar = new Vehicle(new SmallEngine(100));
        Vehicle raceCar2 = new Vehicle(new LargeEngine(500));
        raceCar.crankIgnition();
        raceCar2.crankIgnition();
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Vehicle aCar = (Vehicle) context.getBean("vehicle"); // cast.
        aCar.crankIgnition();
    }
}
