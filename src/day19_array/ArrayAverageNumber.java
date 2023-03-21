package day19_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter ?");
        int total = input.nextInt();

        int[] number = new int[total];

        int sum = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number");
            number[i] = input.nextInt();
            sum += number[i];
        }

        double average = sum / (double) total;

        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println(Arrays.toString(number));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));
    }
}
