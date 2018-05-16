package com.company.processes;

public abstract class GeneralManufacturingProcess {

    private String processName;
    public GeneralManufacturingProcess(String name) {
        processName = name;
    }
    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    public void launchProcess() {

        if (processName != null && processName.length() != 0) {
            // the order/flow is the same for subclasses, but the details are not.
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process name specified!");
        }
    } // Template Method Design Pattern
}
