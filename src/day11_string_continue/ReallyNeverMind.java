package day11_string_continue;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = input.nextLine();

        input.close();

        boolean isEndsWithLy = word.endsWith("ly");
        if (isEndsWithLy) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }


    }
}
/*
Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */