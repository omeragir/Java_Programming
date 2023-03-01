package day09_scanner;

import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result=0;

        System.out.println("Enter your first number : ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter a math operator : ");
        char mathOperator = input.next().charAt(0);

        System.out.println("Enter your second number :");
        double secondNumber = input.nextDouble();

        if (mathOperator == '+') {
            result=firstNumber + secondNumber;
        } else if (mathOperator == '-') {
            result=firstNumber - secondNumber;

        } else if (mathOperator == '*') {
            result=firstNumber * secondNumber;

        } else if (mathOperator == '/') {
            result=firstNumber / secondNumber;

        } else {
            System.out.println("Invalid math operator");
        }

        System.out.println("Result :"+result);
        input.close();

    }
}
