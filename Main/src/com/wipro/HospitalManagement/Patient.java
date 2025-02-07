package com.wipro.HospitalManagement;

import java.util.Scanner;

public class Patient extends User {
    private String medicalHistory;

    public Patient(String name, String email, String phoneNumber, String medicalHistory) {
        super(name, email, phoneNumber);
        this.medicalHistory = medicalHistory;
    }

    public void bookAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the doctor's name for the appointment: ");
        String doctorName = scanner.nextLine();
        System.out.println("Appointment booked with Dr. " + doctorName + ".");
    }

    public void viewMedicalHistory() {
        System.out.println("Your Medical History: " + medicalHistory);
    }

    public void makePayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the payment amount: Rs ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            System.out.println("Payment of Rs." + amount + " made successfully.");
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

	public void addToOutstandingBalance(int i) {
		// TODO Auto-generated method stub
		
	}
}
