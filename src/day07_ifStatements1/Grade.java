package day07_ifStatements1;

public class Grade {
    public static void main(String[] args) {
        String result = "";
        char ch = 'v';
        if (ch == 'A') {
            result = "Excellent";
        }
        if (ch == 'B') {
            result = "Great Job";
        }
        if (ch == 'C') {
            result = "Good";
        }
        if (ch == 'D') {
            result = "Passed";
        }
        if (ch == 'F') {
            result = "Failed";
        } else {
            System.err.print("We don`t find ");
        }
        System.out.println("result = " + result);
    }
}
