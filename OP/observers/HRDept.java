package observers;

import domain.Employee;

public class HRDept implements IObserver {
//    @Override
//    public void callMe() {
////        System.out.println("Notified HR dept.");
//    }

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Notified HR dept.");
        System.out.println(msg + emp.getName());
    }
}
