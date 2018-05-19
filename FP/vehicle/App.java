package vehicle;

public class App {

    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle(VehicleType.CAR);
        Vehicle electricCar = vehicleFactory.getVehicle(VehicleType.ELECTRICCAR);
        Vehicle truck = vehicleFactory.getVehicle(VehicleType.TRUCK);

        car.startEngine();
        electricCar.startEngine();
        truck.startEngine();
    }

}
