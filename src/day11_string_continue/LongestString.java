package day11_string_continue;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first strings : ");
        String first = input.nextLine();

        System.out.println("Enter your second string : ");
        String second = input.nextLine();

        input.close();

        if(first.length()>second.length()){
            System.out.println("First string is longest");

        } else if (second.length()>first.length()) {
            System.out.println("Second string is longest");

        }else {
            System.out.println("First string and second string is equal");
        }

    }
}

/*
Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal
 */