package day08_ternaries_switch;

public class TernaryInto3 {
    public static void main(String[] args) {
        int score = 95;

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "invalid";
        System.out.println(result);
        System.out.println("-------------------------------------");



    }
}
