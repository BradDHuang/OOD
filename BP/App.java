public class App {

    public static void main(String[] args) {
        Vehicle car = new Vehicle.Builder("Car", "Chevy", "Captiva")
                .price(8888.88)
                .doors(4)
                .build();

        System.out.println(car.toString());
    }
    
}
