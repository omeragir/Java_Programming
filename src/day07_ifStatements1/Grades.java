package day07_ifStatements1;

public class Grades {
    public static void main(String[] args) {
        char grade = 'B';
        String result = "";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            if (grade == 'A') {
                result = "exellent";

            } else if (grade == 'B') {
                result = "great job";
            } else if (grade == 'C') {
                result = "good";
            } else if (grade == 'D') {
                result = "passed";
            } else {
                result = "failed";
            }
        } else {
            result = "invalid";
        }
        System.out.println(result);
    }
}
