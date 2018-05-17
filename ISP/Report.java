package com.company;

public class Report {

    private Reporting transObj;

    public void generateReport() {
        System.out.println("Name: " + transObj.getName() + "Date: " + transObj.getDate() + "List: " + transObj.getProductBreakdown());
    }
}
