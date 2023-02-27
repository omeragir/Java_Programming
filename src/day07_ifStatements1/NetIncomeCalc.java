package day07_ifStatements1;

public class NetIncomeCalc {
    public static void main(String[] args) {
        double salary = 100_000;
        double taxRate = 0;
        boolean isMaried = false;
        if (salary >= 130_000) {
            taxRate = 0.35;
        }
        if (salary >= 100_000 && salary <= 129_000) {
            taxRate = 0.30;
        }
        if (salary >= 80_000 && salary <= 99_000) {
            taxRate = 0.25;
        }
        if (salary <= 79_000) {
            taxRate = 0.20;
        }
        if (isMaried) {
            taxRate = taxRate-0.5;
        }

        double totalTax=salary*taxRate;
        double netIncome=salary-totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
