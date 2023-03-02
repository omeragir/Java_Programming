package day11_string_continue;

import java.util.Scanner;

public class CalledEmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address : ");
        String email=input.nextLine();

        input.close();

        int email1=email.indexOf("_");
        int character=email.indexOf("@");
        int character1=email.indexOf(".");

        System.out.println("First name : "+email.substring(0,email.indexOf("_")));
        System.out.println("Last name : "+email.substring(email.indexOf("_")+1,email.indexOf("@")));
        System.out.println("Domain : "+email.substring(email.indexOf("@")+1,email.indexOf(".")));






    }
}
/*
Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */