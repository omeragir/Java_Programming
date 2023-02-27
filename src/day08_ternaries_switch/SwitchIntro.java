package day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("great");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("pass");
                break;
            case 'E':
                System.out.println("limit");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid");
        }


    }
}
