package day13_customMethods1;

import java.util.Scanner;

public class ForLoopRetrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your something");
        String sentence = input.nextLine();

        input.close();

        String letters = "";
        String digits = "";
        String specialChar = "";

        for (int i = 0; i <= sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                letters += c;
            } else if (c >= '0' && c <= '9') {
                digits += c;

            } else {
                specialChar += c;

            }

            System.out.println("letters = " + letters);
            System.out.println("digits = " + digits);
            System.out.println("specialChar = " + specialChar);

        }



    }
}
