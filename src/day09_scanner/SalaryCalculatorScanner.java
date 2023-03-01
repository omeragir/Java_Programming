package day09_scanner;

import java.util.Scanner;

public class SalaryCalculatorScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter his/her hourlyRate");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours he/she works in a week");
        double hoursWorksWeek = input.nextDouble();

        System.out.println("Enter state tax : ");
        double stateTax = input.nextDouble();

        System.out.println("Enter federal tax");
        double federalTax = input.nextDouble();

        double salary = 52 * hoursWorksWeek * hourlyRate;
        double stateTaxRate = salary * stateTax / 100;
        double federalTaxRate = salary * federalTax / 100;
        double totalTax = stateTaxRate + federalTaxRate;
        double netInCome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTaxRate = " + stateTaxRate);
        System.out.println("federalTaxRate = " + federalTaxRate);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netInCome = " + netInCome);

        input.close();


    }
}
/*
Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */