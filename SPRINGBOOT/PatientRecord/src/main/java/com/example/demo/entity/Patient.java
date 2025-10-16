package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_table")
public class Patient {
    @Id
    @Column(name = "patient_id")
    private int id;

    @Column(name = "patient_name", nullable = false, length = 50)
    private String name;

    @Column(name = "patient_age", nullable = false)
    private int age;

    @Column(name = "patient_gender", nullable = false, length = 10)
    private String gender; // MALE, FEMALE, OTHER

    @Column(name = "patient_disease", nullable = false, length = 50)
    private String disease;

    @Column(name = "patient_doctor", nullable = false, length = 50)
    private String doctor;

    @Column(name = "patient_admission_date", nullable = false, length = 20)
    private String admissionDate;

    @Column(name = "patient_contact", nullable = false, unique = true, length = 20)
    private String contact;

    @Column(name = "patient_status", nullable = false, length = 20)
    private String status; // Admitted or Discharged

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getDoctor() {
        return doctor;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getAdmissionDate() {
        return admissionDate;
    }
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender +
               ", disease=" + disease + ", doctor=" + doctor + ", admissionDate=" + admissionDate +
               ", contact=" + contact + ", status=" + status + "]";
    }
}
