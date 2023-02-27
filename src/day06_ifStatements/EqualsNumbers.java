package day06_ifStatements;

public class EqualsNumbers {
    public static void main(String[] args) {
        int a = 100;
        int b = 150;
        int c = 100;

        if (a == b && a == c) {
            System.out.println("All number equals");
        }
        if (a == b && a != c) {
            System.out.println("a & b equals");

        }
        if (b == c && b != a) {
            System.out.println("c & b equals");
        }
        if (c == a && c != b) {
            System.out.println("c & a equals");

        }
        if (a != b && a != c && b != a && b != c && c != a && c != b) {
            System.out.println("All number not equals");

        }


    }
}
