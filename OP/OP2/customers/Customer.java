package customers;

public class Customer implements WaitingCustomer {

    private String name;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    private String orderedDrink;

    public String getOrderedDrink() {
        return orderedDrink;
    }

//    public void setOrderedDrink(String orderedDrink) {
//        this.orderedDrink = orderedDrink;
//    }

    public Customer(String name, String orderedDrink) {
        this.name = name;
        this.orderedDrink = orderedDrink;
    }

    @Override
    public void orderReady(String preparedDrink) {

        if (orderedDrink.equals(preparedDrink)) { // String.
            leave();
        }
    }
    private void leave() {
        System.out.println(name + ": Thx, I got my " + orderedDrink);
    }
}
