package day15_whileLoopIntro;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number : ");
            Scanner input = new Scanner(System.in);
            int num=input.nextInt();

            if(num<min){
                min=num;
            }

        }
        System.out.println("min number is = " + min);

    }

}
