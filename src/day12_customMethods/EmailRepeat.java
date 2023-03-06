package day12_customMethods;

import java.util.Scanner;

public class EmailRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email address : ");
        String email = input.nextLine();

        int underScore = email.indexOf('_');
        int at = email.indexOf('@');


        String lastNAme=email.substring(underScore+1,at);
        String firstName=email.substring(0,underScore);
        System.out.println(lastNAme+"_"+firstName+email.substring(at));

    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */