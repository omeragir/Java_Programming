package day08_ternaries_switch;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber = 1;
        if (gradeNumber >= 1 && gradeNumber <= 6) {
            if (gradeNumber == 1) {
                System.out.println("location - Apple orchard\nnumber of group - 3\nteacher in charge - Ms.Smith");
            } else if (gradeNumber == 2) {
                System.out.println("location - Zoo\nnumber of group - 7\nteacher in charge - Mr.Lee");
            } else if (gradeNumber == 3) {
                System.out.println("location - Aquarium\nnumber of group - 5\nteacher in charge - Ms.Wilson");
            } else if (gradeNumber == 4) {
                System.out.println("location - Movie theater\nnumber of group - 2\nteacher in charge - Ms.Reyes");
            } else if (gradeNumber == 5) {
                System.out.println("location - Museum\nnumber of group - 5\nteacher in charge - Ms.Lela");
            } else if (gradeNumber == 6) {
                System.out.println("location - Six Flags\nnumber of group - 8\nteacher in charge - Mr.Watt");
            } else {
                System.out.println("location -Unkown of - 0\nteacher in charge - Unknown");
            }

        } else {
            System.out.println("invalid grade number");
        }
    }
}
