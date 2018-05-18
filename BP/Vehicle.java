public class Vehicle {

    private String type;
    private String make;
    private String model; // required.
    private String color;
    private double price;
    private int horsePower;
    private int doors; // optional.

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", make=" + make + ", model=" + model
                + ", price=" + price + ", doors=" + doors + ", color=" + color
                + ", horsePower=" + horsePower + "]";
    }

    private Vehicle(Builder builder) { // private!

//        this.type = type;

        this.type = builder.type;
        this.make = builder.make;
        this.model = builder.model;
        this.color = builder.color;
        this.price = builder.price;
        this.horsePower = builder.horsePower;
        this.doors = builder.doors;
    }

    // Builder Pattern.
//    public class Builder { // Nested.
    public static class Builder { // static!

        private String type;
        private String make;
        private String model; // required.
        private String color;
        private double price;
        private int horsePower;
        private int doors; // optional.

        public Builder(String type, String make, String model) {
            this.type = type;
            this.make = make;
            this.model = model;
        }

        public Builder color(String color) {
            this.color = color;

            return this;
        }
        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Builder horsePower(int hp) {
            this.horsePower = hp;
            return this;
        }
        public Builder doors(int num) {
            this.doors = num;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }

}
