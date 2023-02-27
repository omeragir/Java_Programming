package day09_scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month = 1;
        String result1 = "";
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:

                result1 = "31 days";

                break;

                case 2:
            case 4:
            case 6:
            case 9:
            case 11:

                result1 = "28 days";

                break;

            default:
                result1 = "Invalid";
                break;
        }
        System.out.println("result1 = " + result1);
    }
}
