package observers;

import domain.Employee;

public class PayrollDept implements IObserver {
//    @Override
//    public void callMe() {
////        System.out.println("Notified Payroll dept.");
//    }

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Notified Payroll dept.");
        System.out.println(msg + emp.getName());
    }
}
