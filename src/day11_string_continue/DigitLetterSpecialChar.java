package day11_string_continue;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        if (str.length() >= 1) {
            char first = str.charAt(0);

            if (first >= '0' && first <= 9) {
                System.out.println("first character is digit");
            } else if (first >= 'A' && first <= 'Z') {
                System.out.println("first character is uppercase letter");

            } else if (first >= 'a' && first <= 'z') {
                System.out.println("first character is lowercase letter");

            } else {
                System.out.println("first character is special character");
            }

        } else {
            System.out.println("String is empty.");
        }


    }
}
/*
Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table
 */