package subjects;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;

import java.util.ArrayList;
import java.util.List;

//public class EmployeeManagementSystem {
public class EmployeeManagementSystem implements ISubject{

    private Employee employee;
    private String msg;

    private EmployeeDAO employeeDAO;

    private List<IObserver> Observers;
    private List<Employee> employees;

    // use the constructor to init.!
    public EmployeeManagementSystem() {
        Observers = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    public void registerObserver(IObserver observer) {
//        Observers = new ArrayList<>();
        Observers.add(observer);

//        employeeDAO.generateEmployees();
    }

    public void notifyObservers() {
        for (IObserver dept : Observers) {
//            dept.callMe();
            dept.callMe(employee, msg);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        Observers.remove(observer);
    }

//    public String hireNewEmployee(Employee emp) {
    public void hireNewEmployee(Employee emp) {
        employee = emp;
        msg = "New hire: ";
//        employeeDAO.addEmployee(emp);
        employees.add(emp);
        notifyObservers();
//        return "new hire: " + emp.getName();
    }
//    public String modifyEmployeeName(int employeeID, String newName) {
    public void modifyEmployeeName(int employeeID, String newName) {
        // the emp. to be modified MUST already exists!
        boolean empExists = false;

        for (Employee emp : employees) {
            if (employeeID == emp.employeeID) {
                empExists = true;
                emp.setName(newName);
                employee = emp;
                msg = "name modified: ";
            }
        }

        if (empExists) {
            notifyObservers();
        }
//        return "name modified.";
    }
}
