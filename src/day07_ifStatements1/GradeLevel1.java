package day07_ifStatements1;

public class GradeLevel1 {
    public static void main(String[] args) {
        byte grade = 17;
        String result = "";
        if (grade >= 1 && grade <= 18) {
            if (grade <= 5) {
                result = "Elementary school";
            } else if (grade <= 8) {
                result = "Middle school";
            } else if (grade <= 12) {
                result = "High school";

            } else if (grade <= 16) {
                result = "Collage";
            } else {
                result = "Grad school";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
