package day09_scanner;

import java.util.Scanner;

public class CircleScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");

        double radius=input.nextDouble();

        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */