package vehicle;

public enum VehicleType {

    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    },
    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    },
    ELECTRICCAR {
        public Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();
}
