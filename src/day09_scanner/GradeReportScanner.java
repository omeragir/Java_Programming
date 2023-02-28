package day09_scanner;

import java.util.Scanner;

public class GradeReportScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the his/her score : ");
        int grade = input.nextInt();

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("A : Excellent");

            } else if (grade >= 80 && grade < 90) {
                System.out.println("B : Great Job ");

            } else if (grade >= 70 && grade < 80) {
                System.out.println("C : Good");

            } else if (grade >= 50 && grade < 70) {
                System.out.println("C : Passed");

            } else if (grade < 50) {
                System.out.println("F : Failed");

            } else {
                System.out.println("Invalid Grade");
                input.close();
            }

        }


    }
}
/*
 Create a class named GradeReport:
            2.1 Ask the user to enter the his or her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */