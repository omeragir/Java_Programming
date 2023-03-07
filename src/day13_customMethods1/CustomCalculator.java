package day13_customMethods1;

public class CustomCalculator {
    public static void main(String[] args) {

        calculator(50, 6, '*');


    }

    public static void calculator(double num1, double num2, char character) {

        if (character == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (character == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (character == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (character == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.err.println("Invalid character");

        }

    }
}
