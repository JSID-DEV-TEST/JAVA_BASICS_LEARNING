package chapter3;

/*
Nested if statement practice.
To qualify for a loan, a person must make at least $30,000 and have been working at their current job for at
least 2 years.

*/

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]) {
        //Initialize what we know.
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't.
        System.out.println("What is your current salary per year?");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you worked at you current company?");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision.
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Good news. You qualify for a loan.");
            } else {
                System.out.println("Sorry.You must have worked at your job for" + requiredYearsEmployed + "to qualify for the" +
                        "loan.");
            }
        }
        else {System.out.println("Sorry your salary must be " + requiredSalary + " to qualify for a loan.");
        }

    }
}

