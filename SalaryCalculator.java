package chapter3;

import java.util.Scanner;

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

        //Basic If statement


    }
}