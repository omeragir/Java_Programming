package day07_ifStatements1;

public class PosNegZero {
    public static void main(String[] args) {
        int num = 20;
        String result = "";
        if (num > 0) {
            result = "Positive";

        } else if (num < 0) {
            result = "Negative";

        } else {
            result = "Zero";
        }
    }
}
