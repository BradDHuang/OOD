package car;

public class Car {

    private static Car INSTANCE = null;
    private static int counter;

    private Car() {
        counter++; // test for Singleton.
    }

    // public static Car getInstance() {
    public synchronized static Car getInstance() { // Thread-safe.
        if (INSTANCE == null) INSTANCE = new Car(); // Singleton!
        return INSTANCE;
    }
    public int getCounter() {
        return counter; // will always be 1 once getInstance() was called.
    }

    public void startEngine() {
        System.out.println("start the engine.");
    }

}
