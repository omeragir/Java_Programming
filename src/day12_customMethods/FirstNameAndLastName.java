package day12_customMethods;

import java.util.Scanner;

public class FirstNameAndLastName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name= ");
        String firstName=input.nextLine();

        System.out.println("Enter your last name= ");
        String lastName=input.nextLine();

        String first=firstName.toUpperCase().charAt(0)+firstName.substring(1).toLowerCase();
        String last=lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();

        System.out.println(first+" "+last);




    }
}
