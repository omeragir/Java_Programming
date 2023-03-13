package day15_whileLoopIntro;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int max=0;

      /*  Scanner input=new Scanner(System.in);
        System.out.println("Enter your five number : ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        int num5=input.nextInt();

       */
        for (int i = 1; i <=5 ; i++) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num=input.nextInt();

            if(num>max) {
                max = num;

            }

        }
        System.out.println("max= "+max);



    }




}
