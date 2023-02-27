package day07_ifStatements1;

public class Finra {
    public static void main(String[] args) {
        int num = 15;

        String result = "";
        if (num % 3 == 0 && num % 5 == 0) {
            result = "FINRA";
        } else if (num % 3 == 0) {
            result = "FIN";

        } else if (num % 3 == 0) {
            result = "RA";
        } else {
            result = "INVALID";
        }
        System.out.println(result);
    }
}
