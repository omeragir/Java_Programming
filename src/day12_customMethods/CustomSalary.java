package day12_customMethods;

public class CustomSalary {
    public static void main(String[] args) {
        salary(65,35);


    }
    public static void salary(double hourlyRate,int weeklyRate){

        double amount=52*hourlyRate*weeklyRate;
        System.out.println("You make $"+hourlyRate+" per hour");
        System.out.println("You work "+weeklyRate+" in a week");
        System.out.println("You gross income is $"+amount);


    }
}
