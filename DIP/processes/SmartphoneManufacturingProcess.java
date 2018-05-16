package com.company.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String name) {
        super(name); // super() calls the parent constructor.
    }

    @Override
    protected void assembleDevice() {

        System.out.println("Smart-phone assembled");
    }

    @Override
    protected void testDevice() {

        System.out.println("Smart-phone tested");
    }

    @Override
    protected void packageDevice() {

        System.out.println("Smart-phone packaged");
    }

    @Override
    protected void storeDevice() {

        System.out.println("Smart-phone stored");
    }
}
