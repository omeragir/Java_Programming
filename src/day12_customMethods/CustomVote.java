package day12_customMethods;

public class CustomVote {
    public static void main(String[] args) {
        eligibleToVote(25, false);

    }

    public static void eligibleToVote(int age, boolean isAmerican) {
        if (age >= 23 && isAmerican ) {
            System.out.println("You are eligible to vote.");
        } else {
            System.err.println("You are not eligible to vote!");
        }
    }
}
