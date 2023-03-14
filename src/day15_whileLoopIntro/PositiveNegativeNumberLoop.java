package day15_whileLoopIntro;

import java.util.Scanner;

public class PositiveNegativeNumberLoop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
int pos=0;
int neg=0;
int zero=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number : ");
            int num=input.nextInt();
            if(num>0){
                pos++;
            } else if (num<0) {
                neg++;
            }else {
                zero++;
            }

        }
        System.out.println("zero = " + zero);
        System.out.println("neg = " + neg);
        System.out.println("pos = " + pos);


    }
}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */