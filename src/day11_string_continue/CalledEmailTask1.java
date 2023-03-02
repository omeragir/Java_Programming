package day11_string_continue;

import java.util.Scanner;

public class CalledEmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = input.nextLine();

        System.out.println("Enter your second name : ");
        String secondName = input.nextLine();

        System.out.println("Enter your email address : ");
        String email = input.nextLine();
        input.close();
        int email1 = email.indexOf('_');

        if (email.contains("_")) {
            System.out.println(secondName.substring(0) + "_" + firstName.substring(0) + email.substring(email.indexOf('@')));
        } else {
            System.out.println(secondName.substring(0) + firstName.substring(0) + email.substring(email.indexOf('@')));
        }


    }
}
/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */