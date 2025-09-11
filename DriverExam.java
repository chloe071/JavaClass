/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 4/12/2025
 * Assignment: Study Group Task & Discussion: Arrays
 * Instructor: Sergio Pisano
 * Description: A program that grades a quiz that has 10 multiple choice questions. 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DriverExam {
	private final char[] correctAnswers;
	private final char[] studentAnswers;
	
	//constructor initializes the exam with correct and student answers
	public DriverExam(char[] correct, char[] student) {
		correctAnswers = correct;
		studentAnswers = student; 
	}
	//determines if student passed (7+ correct answers)
	public boolean passed() {
		return totalCorrect() >= 7;
	}
	//counts total correct answers
	public int totalCorrect() {
		int count = 0;
		for (int i = 0; i < correctAnswers.length; i++) {
			if(correctAnswers[i] == studentAnswers[i]) {
				count++;
			}
		}
		return count;
	}
	//counts total incorrect answers
	public int totalIncorrect() {
		return correctAnswers.length - totalCorrect();
	}
	//identifies missed question numbers
	public int[] questionsMissed() {
		ArrayList<Integer> missed = new ArrayList<>();
		for(int i = 0; i < correctAnswers.length; i++) {
			if(correctAnswers[i] != studentAnswers[i]) {
				missed.add(i + 1);
			}
		}
		return missed.stream().mapToInt(i -> i).toArray();
	}
	public static void main(String[] args) {
		char[] correct = {'B','D','A','A','C','A','B','A','C','D'};
		char[] student = new char[10];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student's answers (A-D):");
		for(int i = 0; i < 10; i++) {
			while(true) {
				System.out.printf("Q%d: ", i+1);
				String answer = input.nextLine().toUpperCase();
				if(answer.matches("[A-D]")) {
					student[i] = answer.charAt(0);
					break;
				}
				System.out.println("Invalid input. Please enter A, B, C, or D.");
			}
		}
		DriverExam exam = new DriverExam(correct, student);
		System.out.println("\nExam Results:");
		System.out.println("Passed: " + exam.passed());
		System.out.println("Correct: " + exam.totalCorrect());
		System.out.println("Incorrect: " + exam.totalIncorrect());
		System.out.print("Missed Question: ");
		for(int q : exam.questionsMissed()) {
			System.out.print(q + " ");
		}
	}
}
/*CODE OUTPUT:
 * Enter student's answers (A-D):
Q1: B
Q2: D
Q3: A
Q4: A
Q5: C
Q6: A
Q7: B
Q8: A
Q9: C
Q10: D

Exam Results:
Passed: true
Correct: 10
Incorrect: 0
Missed Question: 
 */