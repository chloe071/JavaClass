package WEEK3;

import java.util.Scanner;

public class egCalculator {
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Please enter the second number: ");
        double num2 =  input.nextDouble();

        System.out.println("Addition Result: " + add(num1, num2));
        System.out.println("Subtraction Result: " + subtract(num1, num2));
        System.out.println("Multiplication Result: " + multiply(num1, num2));
        System.out.println("Division Result: " + divide(num1, num2));
    }
}

