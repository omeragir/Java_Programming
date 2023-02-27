package day09_scanner;

import java.util.Scanner;

public class EligibleOrNotEligibleScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age : ");

        int age = input.nextInt();

        if (age >= 21 && age <= 85) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
            input.close();

        }
    }
}
