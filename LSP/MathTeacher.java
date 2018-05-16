package com.company;

//public class MathTeacher extends SchoolStaff {
public class MathTeacher extends SchoolStaff implements Instructor {

    @Override
    public void teach() {
        System.out.println("teach Math.");
    }
}
