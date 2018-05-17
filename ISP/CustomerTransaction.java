package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//public class CustomerTransaction {
//public class CustomerTransaction implements Accounting {
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;
    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    @Override
    public String getName() {
//        return "name";
        return customer.getName();
    }
    @Override
    public Date getDate() {
        return new Date();
    }
    @Override
    public String getProductBreakdown() {
//        return "list of products";
        StringBuilder reportListing = new StringBuilder();
        for (Product p : products) {
            reportListing.append(p.getProductName() + " ");
        }
        return reportListing.toString();
    }

    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared.");
    }
    @Override
    public void chargeCustomer() {
        System.out.println("customer charged.");
    }

    public static void main(String[] args) {
        // write your code here

        Customer c = new Customer();
        c.setName("God");
        Product p1 = new Product();
        Product p2 = new Product();
        p1.setProductName("Book");
        p2.setProductName("Pens");
        List<Product> p = new ArrayList<>();
        p.add(p1);
        p.add(p2);
        CustomerTransaction CT = new CustomerTransaction(c, p);

        System.out.println(CT.getName());
        System.out.println(CT.getProductBreakdown());

    }

}
