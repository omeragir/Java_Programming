package day12_customMethods;

public class Vote {
    public static void main(String[] args) {
        eligibleToVote(25, false);

    }

    public static void eligibleToVote(int age, boolean isAmerican) {
        if (age >= 23 && isAmerican == true) {
            System.out.println("You are eligible to vote.");
        } else {
            System.err.println("You are not eligible to vote!");
        }
    }
}
