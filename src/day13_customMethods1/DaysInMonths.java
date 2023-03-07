package day13_customMethods1;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int month = new Scanner(System.in).nextInt();


        if (month < 1 || month > 12) {
            System.err.println("Invalid number");
            return;
        }

        switch (month) {
            case 2:
                System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:

                System.out.println("30 days");
                break;
            default:

                System.out.println("31 days");

        }
    }


}
