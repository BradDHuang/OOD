package com.company.clients;

import com.company.processes.GeneralManufacturingProcess;
import com.company.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {

        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("I-phone");
        manufacturer.launchProcess(); // DIP: Dependency Inversion Principle
//        Smart-phone assembled
//        Smart-phone tested
//        Smart-phone packaged
//        Smart-phone stored
    }
}
