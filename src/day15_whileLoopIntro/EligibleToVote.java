package day15_whileLoopIntro;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Invalid entry,Please re-enter your age! ");
            age = input.nextInt();
        }

        System.out.println("Are you a  US citizen? Yes/No");
        String yesOrNo = input.next().toLowerCase();

        while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
            System.err.println("Invalid entry,Please re-enter");
            System.out.println("Are you a  US citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();
        }
        if (age >= 21 && yesOrNo.equals("yes")) {
            System.out.println("Eligible toVote");

        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
