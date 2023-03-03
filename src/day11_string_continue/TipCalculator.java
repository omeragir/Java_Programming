package day11_string_continue;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or not Split");
        String split = input.next();

        System.out.println("Enter the number of people : ");
        int people = input.nextInt();

        System.out.println("Enter the check amount : ");
        int amount = input.nextInt();

        System.out.println("Enter the quality : ");
        String quality = input.next();

        input.close();

        double tip = 0;
        double totalPay = amount + tip;

        System.out.println("Total pay : " + totalPay);

        if (split.equalsIgnoreCase("Yes")) {
            switch (quality) {
                case "Poor":
                    tip = amount * 5 / 100;
                    break;
                case "Fair":
                    tip = amount * 10 / 100;
                    break;
                case "Good":
                    tip = amount * 15 / 100;
                    break;
                case "Great":
                    tip = amount * 20 / 100;
                    break;
                case "Excellent":
                    tip = amount * 25 / 100;
                    break;
                default:
                    System.out.println("Invalid");
            }


            System.out.println("Number of people entered :" + people);
            System.out.println("Total to pay : " + totalPay);
            System.out.println("Total tip : " + tip);
            System.out.println("Total per person : " + (totalPay / people));
            System.out.println("Tip per person : " + (tip / people));
        }


    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */