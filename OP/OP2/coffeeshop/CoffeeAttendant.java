package coffeeshop;

import customers.Customer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customersList;

    private List<String> completedDrinks;

    public CoffeeAttendant() {
        customersList = new ArrayList<>();
        completedDrinks = new ArrayList<>();
    }

    public void takeOrder(Customer customer) {
        customersList.add(customer);
        System.out.println("Bartender: '" + customer.getName()
                + ", I've started working on your order of "
                + customer.getOrderedDrink() + "'");
    }

    public void prepareDrink(String drink) {
        completedDrinks.add(drink);
    }

    public void callOutCompletedOrders() {

        for (String readyDrink : completedDrinks) {
            System.out.println("Order up: " + readyDrink);
            for (Customer customer : customersList) {
                customer.orderReady(readyDrink);
            }
        }
    }

}
