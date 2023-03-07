package day13_customMethods1;

import java.util.Scanner;

public class ReturnMethodsPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7) {
            System.err.println("Invalid number");
            return;
        }
        System.out.println((number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday");




    }


}
