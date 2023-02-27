package day07_ifStatements1;

public class GradeLevel {
    public static void main(String[] args) {
        int gradeLevel=11;
        String result="";
        if (gradeLevel<=5) {
            result="Elementary School";
        } else if (gradeLevel<=8) {
            result="Middle School";
        } else if (gradeLevel<=12) {
            result="High School";

        } else if (gradeLevel<=16) {
            result="Collage";

        } else if (gradeLevel<=18) {
            result="Grad School";

        }else {
            result="Not find";
        }
        System.out.println(result);
    }
}
