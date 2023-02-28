package day10_string;

import java.util.Scanner;

public class StringsMethods1 {
    public static void main(String[] args) {
        String str = "Cydeo"; //
        // index      01234
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("------------------------------------------");

        String sentence = "Java Programming Language";
        int length = sentence.length();
        System.out.println("length = " + length);
        int lastIndex = length - 1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("------------------------------------------");

        String s1 = "Wooden Spoon";
        char first = s1.charAt(0);

        int lastInd = s1.length() - 1;

        char secondInd = s1.charAt(lastInd);

        System.out.println("secondInd = " + secondInd);
        System.out.println(first);
        System.out.println("------------------------------------------");

        String name1 = "Umran";

        String name2 = new String("Umran");

        System.out.println(name1 == name2);

        System.out.println(name1.equalsIgnoreCase(name2));

        System.out.println("------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1 == r2);//true (String pools)
        System.out.println(r2 == r3);//false (not String pools)
        System.out.println(r2.equals(r3));//true
        System.out.println("------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");

        int age = input.nextInt();
        input.nextLine();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.nextLine();

        if (age >= 21 && answer.equals("yes")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }

    }
}
