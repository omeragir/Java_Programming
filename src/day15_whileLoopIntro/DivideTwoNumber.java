package day15_whileLoopIntro;

import java.util.Scanner;

public class DivideTwoNumber {
    public static void main(String[] args) {
int count=0;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1=input.nextInt();

        System.out.println("Enter second number : ");
        int num2=input.nextInt();

        while (num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count+" with a remainder of "+num1);
    }

}
/*
Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */