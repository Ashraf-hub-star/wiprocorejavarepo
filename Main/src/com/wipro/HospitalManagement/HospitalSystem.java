package com.wipro.HospitalManagement;

import java.util.Scanner;

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Register a Patient:");
        System.out.print("Enter Patient's Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter Patient's Email: ");
        String patientEmail = scanner.nextLine();
        System.out.print("Enter Patient's Phone Number: ");
        String patientPhone = scanner.nextLine();
        System.out.print("Enter Patient's Medical History: ");
        String patientHistory = scanner.nextLine();
        Patient patient = new Patient(patientName, patientEmail, patientPhone, patientHistory);

        System.out.println("\nRegister a Doctor:");
        System.out.print("Enter Doctor's Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter Doctor's Email: ");
        String doctorEmail = scanner.nextLine();
        System.out.print("Enter Doctor's Phone Number: ");
        String doctorPhone = scanner.nextLine();
        System.out.print("Enter Doctor's Specialization: ");
        String specialization = scanner.nextLine();
        Doctor doctor = new Doctor(doctorName, doctorEmail, doctorPhone, specialization);

        System.out.println("\nRegister an Admin:");
        System.out.print("Enter Admin's Name: ");
        String adminName = scanner.nextLine();
        System.out.print("Enter Admin's Email: ");
        String adminEmail = scanner.nextLine();
        System.out.print("Enter Admin's Phone Number: ");
        String adminPhone = scanner.nextLine();
        Admin admin = new Admin(adminName, adminEmail, adminPhone);

        int choice;
        do {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Patient Actions");
            System.out.println("2. Doctor Actions");
            System.out.println("3. Admin Actions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Patient Actions ---");
                    System.out.println("1. Book Appointment");
                    System.out.println("2. View Medical History");
                    System.out.println("3. Make Payment");
                    System.out.print("Choose an action: ");
                    int patientChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (patientChoice == 1) {
                        patient.bookAppointment();
                    } else if (patientChoice == 2) {
                        patient.viewMedicalHistory();
                    } else if (patientChoice == 3) {
                        System.out.print("Enter payment amount: Rs.");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();
                        patient.makePayment();
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Doctor Actions ---");
                    System.out.println("1. View Appointments");
                    System.out.println("2. Access Patient Record");
                    System.out.print("Choose an action: ");
                    int doctorChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (doctorChoice == 1) {
                        doctor.viewAppointments();
                    } else if (doctorChoice == 2) {
                        doctor.accessPatientRecord(patient);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Admin Actions ---");
                    System.out.println("1. Manage Users");
                    System.out.println("2. Generate Reports");
                    System.out.println("3. Manage Schedules");
                    System.out.print("Choose an action: ");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (adminChoice == 1) {
                        admin.manageUsers();
                    } else if (adminChoice == 2) {
                        admin.generateReports();
                    } else if (adminChoice == 3) {
                        admin.manageSchedules();
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}