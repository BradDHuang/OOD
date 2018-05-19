package car;

public class App {

    public static void main(String[] args) {

        Car car = Car.getInstance();

        car.startEngine();
        System.out.println(car.getCounter()); // 1

        Car car2 = Car.getInstance();

        car2.startEngine();
        System.out.println(car2.getCounter()); // 1
    }

}
