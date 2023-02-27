package day06_ifStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 'A';
        boolean isAlphabetic = ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
        boolean isDigit = ch >= '0' && ch <= '9';
        boolean isSpecialCharacte = !isAlphabetic && !isDigit;

        String result = "";

        if (isAlphabetic) {
            result = "Alphabet";
        }
        if (isDigit) {
            result = "Digit";


        }
        if (isSpecialCharacte) {
            result = "Special Character";
        }
        System.out.println(result);
    }
}
