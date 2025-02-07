package com.wipro.HospitalManagement;

public class Doctor extends User {
    private String specialization;

    public Doctor(String name, String email, String phoneNumber, String specialization) {
        super(name, email, phoneNumber);
        this.specialization = specialization;
    }

    public void viewAppointments() {
        System.out.println("Viewing appointments for Dr. " + getName() + ".");
    }

    public void accessPatientRecord(Patient patient) {
        System.out.println("Accessing medical record of Patient: " + patient.getName());
        patient.viewMedicalHistory();
    }
}
