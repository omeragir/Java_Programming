package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cyde School";
        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------");

        String str1 = "Today is great day to learn java";

        String[] words = str1.split(" ");

        System.out.println(Arrays.toString(words));
        System.out.println("------------------------------------");

        String sentence="I love Java";






    }
}
