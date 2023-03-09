package chapter3;

import java.util.Scanner;

/*
if statement practice
All sales people get a payment of £1000 per week
sales people who exceed 10 sales get an additional bonus of £250
 */
public class SalaryCalculator {
    public static void main (String args []){

        //Initialize know values
        int salary = 1000;
        int bonus = 250;
        //Get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Bonus earners
        if(sales > 10){
            salary = salary + bonus;
        }

        //output
        System.out.println("The employees salary for this week is £" + salary);


    }
}