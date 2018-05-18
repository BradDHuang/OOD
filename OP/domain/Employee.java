package domain;

import java.util.Date;

public class Employee {

    private String name;
    private Date hireDate;
    private int salary;
    private boolean working;

    public int employeeID;

    private static int COUNTER; // static：类(Employee)的所有成员共享该属性。
//    private int COUNTER; // App.java 中无法access COUNTER.

    public Employee(String name, Date hireDate, int salary, boolean working) {

        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;

//        employeeID = ++COUNTER;
        employeeID = COUNTER++;

    }

    @Override
    public String toString() {
        return "domain.Employee [name=" + name + ", hireDate=" + hireDate
                + ", salary=" + salary + ", employeeID=" + employeeID + ", isWorking=" + working+ "]";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return this.employeeID;
    }
}
