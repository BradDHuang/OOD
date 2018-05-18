package observers;

import domain.Employee;

public interface IObserver {

//    void callMe();
    void callMe(Employee emp, String msg);
}
