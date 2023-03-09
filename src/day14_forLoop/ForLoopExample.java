package day14_forLoop;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

       int result= sum(num);
        System.out.println(result);



    }

    public static int sum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */