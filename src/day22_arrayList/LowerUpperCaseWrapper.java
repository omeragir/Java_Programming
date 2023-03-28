package day22_arrayList;

public class LowerUpperCaseWrapper {
    public static void main(String[] args) {
        int count = 0;
        int freq = 0;
        String str = "JAVA java";
        for (Character each : str.toCharArray()) {
            if (Character.isLowerCase(each)) {
                count++;
            }
            if (Character.isUpperCase(each)) {
                freq++;
            }

        }
        if (count == freq) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */