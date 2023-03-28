package day22_arrayList;

public class Retrieve {
    public static void main(String[] args) {
        String str = "1Wooden 2Spoon!3";

        String isDigit = "";
        String isLetter = "";
        String isSpecial = "";

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                isDigit += each + " ";
            }
            if (Character.isLetter(each)) {
                isLetter += each + " ";
            }
            if (!Character.isLetterOrDigit(each)) {
                isSpecial += each + " ";
            }
        }
        System.out.println("isSpecial = " + isSpecial.trim());
        System.out.println("isLetter = " + isLetter);
        System.out.println("isDigit = " + isDigit);


    }
}
/*
Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */