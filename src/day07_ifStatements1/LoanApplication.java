package day07_ifStatements1;

public class LoanApplication {
    public static void main(String[] args) {
        int creditScore = 750;

        int salary = 45_000;

        String result = "";

        if (salary >= 50_000 && creditScore >= 750) {
            result = "Eligible";
        } else {
            result = "Not eligible";
        }
        System.out.println("result = " + result);
    }
}
