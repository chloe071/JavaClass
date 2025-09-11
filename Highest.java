package WEEK8;

import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -1;
        int min = 100;
        int grade; // grade entered by user

        for (int counter=1; counter<=10; counter++)
        {
            System.out.print("Enter a grade: ");
            grade = input.nextInt();
            if (grade > max)
                max = grade;
            if (grade < min)
                min = grade;
        } //end for
        System.out.println("The highest grade is" + max);
        System.out.println("The minimum grade is" + min);
    }
}
