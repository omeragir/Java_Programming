package day07_ifStatements1;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 't';
        String result = "";
        if (ch == 'A') {
            result = "Exellent";
        } else if (ch == 'B') {
            result = "Great Job";

        } else if (ch == 'C') {
            result = "Good";

        } else if (ch == 'D') {
            result = "Passed";

        } else if (ch == 'F') {
            result = "Failed";
        } else {
            result = "We don`t find result";
        }
        System.out.println("result = " + result);
    }
}
