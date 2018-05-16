package com.company;

//public abstract class SchoolStaff {
public class SchoolStaff {

//    public abstract void teach();

    private void makeAnnouncements() {
        System.out.println("make Announcements");
    }
    private void takeAttendance() {
        System.out.println("take Attendance");
    }
    private void collectPaperWorks() {
        System.out.println("collect Paper-works");
    }
    private void conductHallwayDuties() {
        System.out.println("conduct Hallway Duties");
    }

    public void performOtherDuties() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWorks();
        conductHallwayDuties();
    }
}
