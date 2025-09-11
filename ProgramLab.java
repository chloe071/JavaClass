/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 2/27/2025
 * Assignment: zyLab (H)
 * Instructor: Sergio Pisano
 * Description: Calculates a course grade given points for homework, quizzes, miderm exam, and final exam.
 */
import java.util.Scanner;
public class ProgramLab {

	public static void main(String[] args) {
		//maximum possible points for each category
		final double HOMEWORK_MAX = 800.0;
		final double QUIZZES_MAX = 400.0;
		final double MIDTERM_MAX = 150.0;
		final double FINAL_MAX = 200.0;
		
		Scanner scnr = new Scanner(System.in);
		
		//read the input values
		String studentStatus = scnr.next();
		double homeworkPoints = scnr.nextDouble();
		double quizPoints = scnr.nextDouble();
		double midtermPoints = scnr.nextDouble();
		double finalPoints = scnr.nextDouble();
		
		//check for valid student status
		if (!studentStatus.equals("UG") && !studentStatus.equals("G") && !studentStatus.equals("DL")) {
			System.out.println("Error: student status must be UG, G or DL");
			return;
		}
		
		//calculate averages
		double homework = Math.min((homeworkPoints / HOMEWORK_MAX) * 100, 100.0);
		double quizzes = Math.min((quizPoints / QUIZZES_MAX) * 100, 100.0);
		double midterm = Math.min((midtermPoints / MIDTERM_MAX) * 100, 100.0);
		double finalExam = Math.min((finalPoints / FINAL_MAX) * 100, 100.0);
		
		//output averages
		System.out.printf("Homework: %.1f%%%n", homework);
		System.out.printf("Quizzes: %.1f%%%n", quizzes);
		System.out.printf("Midterm: %.1f%%%n", midterm);
		System.out.printf("Final Exam: %.1f%%%n", finalExam);
		
		double courseAverage = 0.0;
		
		//calculate course average based on student status
		if (studentStatus.equals("UG")) {
			courseAverage = (homework * 0.20) + (quizzes * 0.20) + (midterm * 0.30) + (finalExam * 0.30);
		} else if (studentStatus.equals("G")) {
			courseAverage = (homework * 0.15) + (quizzes * 0.05) + (midterm * 0.35) + (finalExam * 0.45);
		} else if (studentStatus.equals("DL")) {
			courseAverage = (homework * 0.05) + (quizzes * 0.05) + (midterm * 0.40) + (finalExam * 0.50);
		}
		
		//output course average
		System.out.printf("%s average: %.1f%%%n", studentStatus, courseAverage);
		
		//determine letter grade based on course average
		String letterGrade;
		if (courseAverage >= 90.0) {
			letterGrade = "A";
		} else if (courseAverage >= 80.0) {
			letterGrade = "B";
		} else if (courseAverage >= 70.0) {
			letterGrade = "C";
		} else if (courseAverage >= 60.0) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		//output course letter grade
		System.out.println("Course grade: " + letterGrade);
	}
}
/*
 * Code Output:
 * Homework: 75.0%
 * Quizzes: 75.0%
 * Midterm: 80.0%
 * Final Exam: 75.0%
 * DL Average: 77.0%
 * Course grade: C
 */