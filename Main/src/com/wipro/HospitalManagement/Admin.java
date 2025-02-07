package com.wipro.HospitalManagement;

public class Admin extends User {
    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }

    public void manageUsers() {
        System.out.println("Managing users in the system.");
    }

    public void generateReports() {
        System.out.println("Generating system-wide reports.");
    }

    public void manageSchedules() {
        System.out.println("Managing schedules for doctors and patients.");
    }
}
