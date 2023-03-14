package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(+num + " Even number");
            } else {
                System.out.println(num + " Odd number");
            }
            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) ;
            System.out.println("Invalid Entry! Would you like to enter another number? Yes/No");
            input.next().toLowerCase();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }


    }
}
