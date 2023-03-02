package day11_string_continue;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fist word : ");
        String word1 = input.nextLine();

        System.out.println("Enter your second word : ");
        String word2 = input.nextLine();

        input.close();

        System.out.println(word1.substring(0)+word2.substring(1));

    }
}
