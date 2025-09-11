package challenge2;

import javax.swing.*;
/**
 * FIURegistrar class to manage student registration and GPA processing.
 */

public class FIURegistrar {
    public static void main(String[] args) {
        //create an array of student objects
        Student[] students = createArrayOfStudents();
        //process the array of students to find and display GPAs
        processArrayOfStudents(students);
    }
    /**
     * Creates an of Students to find and display GPAs
     * return array of student objects
     */
    public static Student[] createArrayOfStudents() {
        //Ask user for the number of students
        String input = JOptionPane.showInputDialog("Enter the number of students:");
        int numStudents = Integer.parseInt(input);

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            //collect student information
            String firstName = JOptionPane.showInputDialog("Enter first name for student " + (i + 1) + ":");
            String lastName = JOptionPane.showInputDialog("Enter last name for student " + (i + 1) + ":");
            String pantherId = JOptionPane.showInputDialog("Enter panther ID for student " + (i + 1) + ":");
            double gpa;
            //validate gpa input
            while (true) {
                String gpaInput = JOptionPane.showInputDialog("Enter GPA (0.0 - 4.0) for student " + (i + 1) + ":");
                gpa = Double.parseDouble(gpaInput);
                if (gpa >= 0 && gpa <= 4.0) {
                    break; //validate GPA, break out of the loop
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid GPA! Please enter a value between 0.0 and 4.0.");
                }
            }
            //create a student object and add it to the array
            students[i] = new Student(firstName, lastName, pantherId, gpa);
        }
        return students;
    }
    /**
     * processes an array of student objects to find highest and lowest gpa and calculates average gpa.
     * param students array of student objects
     */
    public static void processArrayOfStudents(Student[] students) {
        double highestGpa = Double.MIN_VALUE;
        double lowestGpa = Double.MAX_VALUE;
        double sumGpa = 0;
        int numStudents = students.length;
        Student highestStudent = null;
        Student lowestStudent = null;
        //Calculate total GPA, highest GPA, and lowest GPA in one loop
        for (Student student : students) {
            //print student's info
            System.out.println(student);
            double gpa = student.getGpa();
            sumGpa += gpa;

            if (gpa > highestGpa) {
                highestGpa = gpa;
                highestStudent = student;
            }
            if (gpa < lowestGpa) {
                lowestGpa = gpa;
                lowestStudent = student;
            }
        }
        double averageGpa = sumGpa / numStudents;
        //display results
        System.out.printf("Highest GPA: %.2f Student: %s%n", highestGpa, highestStudent);
        System.out.printf("Lowest GPa: %.2f Student: %s%n", lowestGpa, lowestStudent);
        System.out.printf("Average GPA: %.2f%n", averageGpa);
        //print students with above average gpa
        System.out.println("Students that have an above average GPA:");
        for (Student student : students) {
            if (student.getGpa() > averageGpa) {
                System.out.println(student);
            }
        }
    }
}
