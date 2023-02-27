package day07_ifStatements1;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 12;
        String result = "";
        if (age > 0 && age < 150) {
            if (age < 21) {
                result = "Teenegar";
            } else if (age >= 21 && age < 55) {
                result = "Adult";
            } else {
                result = "Senior";
            }

        } else {
            result = "invalid";
        }
        System.out.println(result);
    }
}
