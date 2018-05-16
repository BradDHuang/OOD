package com.company;

//public class ScienceTeacher extends SchoolStaff {
public class ScienceTeacher extends SchoolStaff implements Instructor {

    @Override
    public void teach() {
        System.out.println("teach Science.");
    }
}
