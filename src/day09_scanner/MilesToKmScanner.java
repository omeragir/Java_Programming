package day09_scanner;

import java.util.Scanner;

public class MilesToKmScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double miles=1;
       double km=miles*1.609;

        System.out.println("Enter your miles :");
       double total=input.nextDouble()*km;
        System.out.println(total+" Km");
        input.close();
    }
}
