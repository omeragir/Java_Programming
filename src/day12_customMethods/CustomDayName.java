package day12_customMethods;

public class CustomDayName {
    public static void main(String[] args) {
        dayName(9);

    }

    public static void dayName(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            if (dayNumber == 1) {
                System.out.println("Day is Monday");
            } else if (dayNumber == 2) {
                System.out.println("Day is Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Day is Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Day is Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Day is Friday");
            } else if (dayNumber == 6) {
                System.out.println("Day is Saturday");
            } else {
                System.out.println("Day is Sunday");
            }
        } else {
            System.err.println("Invalid number");
        }
    }


}
