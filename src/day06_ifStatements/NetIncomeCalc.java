package day06_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        double salary = 60_000;
        boolean isMarried = true;
        double taxRate = 0;

        if (salary >= 130_000) {
            taxRate = 0.35;
        }
        if (salary < 130000 && salary >= 100000) { //false: salary < 100000;
            taxRate = 0.30; //30%
        }
        if (salary < 100000 && salary >= 80000) { //false: salary < 80000
            taxRate = 0.25; //25%
        }
        if (salary < 80000) {
            taxRate = 0.20; //20%


        }
        if (salary < 80000) {
            taxRate = 0.20; //20%

        }
        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);
    }
}
