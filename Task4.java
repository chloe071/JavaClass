package WEEK3;

import java.util.Scanner;

public class Task4 {
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
        return milesDriven *(1.0/ milesPerGallon) * dollarsPerGallon;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double milesPerGallon;
        double dollarsPerGallon;
        milesPerGallon = scnr.nextDouble();
        dollarsPerGallon = scnr.nextDouble();
        System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
        System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
        System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 400.0));
    }
}
