package com.company;

//public class EnglishTeacher extends SchoolStaff {
public class EnglishTeacher extends SchoolStaff implements Instructor {

    @Override
    public void teach() {
        System.out.println("teach English.");
    }
}
