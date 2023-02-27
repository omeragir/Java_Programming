package day09_scanner;

import java.util.Scanner;

//import java.util.*; All of data take
public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//for reading user inputs

        System.out.println("Enter your first number : ");

        byte number1 = input.nextByte();

        System.out.println("Enter your second number : ");

        short number2 = input.nextShort();

        System.out.println("Enter your third number : ");

        int number3 = input.nextInt();

        System.out.println("Enter your fourth number : ");

        long number4 = input.nextLong();

        System.out.println("Enter your fifth number : ");

        double number5 = input.nextDouble();

        input.close();



        System.out.println("Enter your second number : " + number1);
        System.out.println("Enter your second number : " + number2);
        System.out.println("Enter your third number : " + number3);
        System.out.println("Enter your fourth number : " + number4);
        System.out.println("Enter your fifth number : " + number5);


    }
}
