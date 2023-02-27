package day07_ifStatements1;

public class IfStatementsWithOutCurlyBraces {
    public static void main(String[] args) {
        int age = 32;
        if (age >= 21)
            System.out.println("Egieble;");
        else
            System.out.println("Not");

        System.out.println("---------------------------");

        if (age == 21) {
            System.out.println("a");
            System.out.println("b");
        } else if (age == 34) {
            System.out.println("g");
            System.out.println("r");

        } else {
            System.out.println("w");
            System.out.println("q");
        }

    }
}
