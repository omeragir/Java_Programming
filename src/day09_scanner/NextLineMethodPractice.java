package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");

        String full_name = input.nextLine();

        System.out.println("Enter your school name: ");

        String school_name = input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your age : ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String street = input.nextLine();

        System.out.println("full_name = " + full_name);
        System.out.println("school_name = " + school_name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("street = " + street);

        input.close();
    }
}
