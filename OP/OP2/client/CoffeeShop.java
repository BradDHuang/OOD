package client;

import coffeeshop.CoffeeAttendant;
import customers.Customer;

public class CoffeeShop {

    public static void main(String[] args) {

        Customer RDJ = new Customer("Rob", "US Lemonade soda");
        Customer Brad = new Customer("Bradley", "French Lemonade soda");

        CoffeeAttendant bartender = new CoffeeAttendant();

        bartender.takeOrder(RDJ);
        bartender.takeOrder(Brad);

//        bartender.prepareDrink("US Lemonade soda");
//        bartender.prepareDrink("French Lemonade soda");
        bartender.prepareDrink(RDJ.getOrderedDrink());
        bartender.prepareDrink(Brad.getOrderedDrink());

        bartender.callOutCompletedOrders();
    }

}
