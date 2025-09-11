package challenge2;

import javax.swing.*;

/**
 * Student class representing a student with personal details and GPA.
 */
public class Student {
    // Instance variables
    private String firstName;
    private String lastName;
    private String pantherId;
    private double gpa;

    // Constructor
    public Student(String firstName, String lastName, String pantherId, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherId = pantherId;
        this.gpa = gpa;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPantherId() {
        return pantherId;
    }

    public void setPantherId(String pantherId) {
        this.pantherId = pantherId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString method to print the student information
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pantherId='" + pantherId + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
