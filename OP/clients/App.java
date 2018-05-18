package clients;

import domain.Employee;
import observers.HRDept;
import observers.IObserver;
import observers.PayrollDept;
import subjects.EmployeeManagementSystem;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        IObserver payroll = new PayrollDept();
        IObserver hrSystem = new HRDept();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireNewEmployee(bob);
        System.out.println(bob.toString());

        ems.modifyEmployeeName(5, "Brad"); // ID = 0 ~ 5.
        ems.modifyEmployeeName(6, "Imtiaz"); // There is no emp. with ID=6.
    }
}
