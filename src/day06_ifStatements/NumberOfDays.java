package day06_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 10;

        boolean has28DAy = number == 2;
        boolean has30Day = number == 4 || number == 6 || number == 9 || number == 11;

        boolean has31Day = !has30Day && !has28DAy;

        String result = "";

        if (has28DAy) {

            result="28";
        }
        if (has30Day) {

            result="30";
        }
        if (has31Day) {

            result="31";
        }
        System.out.println(result);

    }

}
