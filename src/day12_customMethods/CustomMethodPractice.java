package day12_customMethods;

public class CustomMethodPractice {
    public static void main(String[] args) {

        eligible(100);
        System.out.println("----------------------------------");
        oddEvenZero(20);
        System.out.println("----------------------------------");
        maximumNumber(12, 12);
        System.out.println("----------------------------------");
        initial("bond", "james");
        System.out.println("----------------------------------");
        grade(85);

    }

    public static void eligible(int age) {

        if (age >= 21) {
            System.out.println("Eligible");
        } else System.out.println("Not eligible");
    }

    public static void oddEvenZero(int number) {
        if (number == 0) {
            System.out.println(number + " is zero number");
        } else if (number % 2 != 0) {
            System.out.println(number + " is odd number");

        } else {
            System.out.println(number + " is even number");
        }
    }

    public static void maximumNumber(double maximum1, double maximum2) {
        if (maximum2 > maximum1) {
            System.out.println(maximum2 + " is maximum number");
        } else if (maximum2 < maximum1) {
            System.out.println(maximum1 + " is maximum number");
        } else {
            System.out.println(" equals ");
        }
    }

    public static void initial(String firstName, String lastName) {
        System.out.println("" + firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0));

    }

    public static void grade(int note) {
        if (note >= 0 && note <= 100) {
            if (note > 90) {
                System.out.println("Excellent");
            } else if (note >= 70 && note < 90) {
                System.out.println("Great");
            } else if (note >= 60 && note < 70) {
                System.out.println("Good");
            } else if (note >= 50 && note < 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid note");
        }
    }


}
