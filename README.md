# Java Coursework (COP2250)

Programs I wrote for **COP2250 — Java Programming**, covering input/output, decisions, loops, methods, arrays, ArrayLists, and object-oriented design. Every file compiles with JDK 17.

## Highlights

| Program | What it does | Concepts |
|---|---|---|
| [`FIURegistrar.java`](FIURegistrar.java) + [`Student.java`](Student.java) | Collects student records through dialog boxes and reports GPAs | Classes, arrays of objects, Swing `JOptionPane` |
| [`CalorieTracker.java`](CalorieTracker.java) | Tracks calories consumed and burned for a week and reports totals, averages, and net weight change | Arrays, methods, formatted output |
| [`ShoppingCartPrinter.java`](ShoppingCartPrinter.java) + [`ItemToPurchase.java`](ItemToPurchase.java) | Builds a two-item cart and prints the total cost | Classes, getters/setters |
| [`PlayerRoster.java`](PlayerRoster.java) | Stores and edits a soccer team's jersey numbers and ratings through a menu | Arrays, menus, loops |
| [`DriverExam.java`](DriverExam.java) | Grades a 10-question multiple-choice exam (pass = 7+ correct) | Classes, arrays, constructors |
| [`BankAccountSystem.java`](BankAccountSystem.java) | Simulates deposits and withdrawals on an account | Loops, input validation |
| [`TroubleshootingGuide.java`](TroubleshootingGuide.java) | Walks a user through computer troubleshooting steps | Nested decisions |
| [`RockPaperScissors.java`](RockPaperScissors.java) | Plays multiple rounds of rock-paper-scissors | Random numbers, loops |
| [`card.java`](card.java) | Simple card game against the computer | Loops, random numbers |
| [`BruteForce.java`](BruteForce.java) | Solves two linear equations by brute force over -10 to 10 | Nested loops |

## Labs and Exercises

| Program | What it does |
|---|---|
| [`Calculator.java`](Calculator.java) | Converts nickels, dimes, and quarters to a dollar amount |
| [`CountCharacter.java`](CountCharacter.java) | Counts occurrences of a character in a string |
| [`Driver.java`](Driver.java) | Calculates hourly wages plus overtime |
| [`HighwayNumber.java`](HighwayNumber.java) | Classifies U.S. interstate highway numbers |
| [`LabProgram.java`](LabProgram.java) | Prints a string in reverse |
| [`Main.java`](Main.java) | Copies only negative values from an ArrayList |
| [`OddNumbers.java`](OddNumbers.java) | Removes odd numbers from an array |
| [`Power.java`](Power.java) | Calculates powers and formatted math results |
| [`ProgramLab.java`](ProgramLab.java) | Calculates a course grade from homework, quizzes, and exams |
| [`SpeedingTicket.java`](SpeedingTicket.java) | Calculates a speeding ticket fine |
| [`Cart.java`](Cart.java) | Item class with purchase-price getter and setter |
| [`Highest.java`](Highest.java) | Finds the highest and lowest of entered grades |
| [`Range.java`](Range.java) | Prints even numbers between a start and stop value |
| [`SwitchCase.java`](SwitchCase.java) | Converts a day number to a day name |
| [`validation.java`](validation.java) | Validates a number from 1 to 10 and reports even/odd |
| [`egCalculator.java`](egCalculator.java) | Basic two-number calculator |
| [`Task4.java`](Task4.java) | Formatted arithmetic output |
| [`array1.java`](array1.java) | Array basics |

`Java.zip` contains the full IntelliJ course project organized by week.

## Running a Program

Files without a `package` line:

```bash
javac BruteForce.java
java BruteForce
```

Files with a `package` line (for example `FIURegistrar.java` is in package `challenge2`) must be compiled into a matching folder:

```bash
javac -d out FIURegistrar.java Student.java
java -cp out challenge2.FIURegistrar
```
