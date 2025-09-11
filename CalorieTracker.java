package challenge1;

import java.util.Scanner;

public class CalorieTracker {
    //Global variables to hold the daily calorie data
    int day1CalConsumed, day1CalBurned;
    int day2CalConsumed, day2CalBurned;
    int day3CalConsumed, day3CalBurned;
    int day4CalConsumed, day4CalBurned;
    int day5CalConsumed, day5CalBurned;
    int day6CalConsumed, day6CalBurned;
    int day7CalConsumed, day7CalBurned;
    //Global totals
    int totalCaloriesConsumed;
    int totalCaloriesBurned;

    //Global averages and net pounds
    double averageCaloriesConsumed;
    double averageCaloriesBurned;
    double netWeeklyPounds;

    public static void main(String[] args) {
        CalorieTracker tracker = new CalorieTracker();
        tracker.getUserInput();
        tracker.calculateCalories();
        tracker.displayCalories();
    }
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        //Loop through each day and gather input
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter calories consumed for day #" + day + ": ");
            int consumed = scanner.nextInt();
            System.out.print("Enter calories burned for day #" + day + ": ");
            int burned = scanner.nextInt();

            switch (day) {
                case 1:
                    day1CalConsumed = consumed;
                    day1CalBurned = burned;
                    break;
                case 2:
                    day2CalConsumed = consumed;
                    day2CalBurned = burned;
                    break;
                case 3:
                    day3CalConsumed = consumed;
                    day3CalBurned = burned;
                    break;
                case 4:
                    day4CalConsumed = consumed;
                    day4CalBurned = burned;
                    break;
                case 5:
                    day5CalConsumed = consumed;
                    day5CalBurned = burned;
                    break;
                case 6:
                    day6CalConsumed = consumed;
                    day6CalBurned = burned;
                    break;
                case 7:
                    day7CalConsumed = consumed;
                    day7CalBurned = burned;
                    break;

            }
        }
    }
        public void calculateCalories() {
        //calculate total consumed and burned calories
            totalCaloriesConsumed = day1CalConsumed + day2CalConsumed + day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed;
            totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned +day7CalBurned;
            //calculate averages
            averageCaloriesConsumed = (double) totalCaloriesConsumed / 7;
            averageCaloriesBurned = (double) totalCaloriesBurned / 7;
            //calculate net weekly pounds
            netWeeklyPounds = (double) (totalCaloriesConsumed - totalCaloriesBurned) / 3000.0;
    }
    public void displayCalories() {
        //print results
        System.out.printf("You consumed a total of %,d calories this week.%n", totalCaloriesConsumed);
        System.out.printf("You burned a total of %,d calories this week.%n", totalCaloriesBurned);
        System.out.printf("You consumed an average of %.2f calories a day.%n", averageCaloriesConsumed);
        System.out.printf("You burned an average of %.2f calories a day.%n", averageCaloriesBurned);
        System.out.printf("Your net weekly gain/loss were %.3f pounds.%n", netWeeklyPounds);
    }
}
