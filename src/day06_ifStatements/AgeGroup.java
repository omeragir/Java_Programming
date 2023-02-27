package day06_ifStatements;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 75;
        String result = "";
        if (age >= 1 && age <= 2) {
            result = "infant";
        }
        if (age >= 3 && age <= 6) {
            result = "Toddler";
        }
        if (age >= 6 && age <= 9) {
            result = "Kid";
        }
        if (age >= 10 && age <= 12) {
            result = "Pre-Teen";
        }
        if (age >= 13 && age <=20) {
            result = "Young Adult";
        }
        if (age == 21 && age < 40) {
            result = "Adult";
        }
        if (age == 40 && age < 50) {
            result = "Young Middle-Aged Adult";
        }
        if (age == 50 && age < 55) {
            result = "Middle Age";
        }
        if (age == 55 && age < 65) {
            result = "Very Young Senior";
        }
        if (age == 65 && age < 75) {
            result = "Young Senior Citizen";
        }
        if (age == 75 && age < 85) {
            result = "Senior Citizen";
        }
        if (age >= 85) {
            result = "Old Senior Citizen";
        }


        System.out.println(result);

    }
}
