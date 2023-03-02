package day11_string_continue;

import java.util.Scanner;

public class WithOutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word : ");
        String word1=input.nextLine();

        System.out.println("Enter your second word : ");
        String word2=input.nextLine();
        input.close();

        System.out.println(word1.substring(1)+word2.substring(1));
    }
}
