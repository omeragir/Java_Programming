package day21_multiDimentionalArray;

import java.util.Arrays;

public class AnagramTAsk {
    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";
        //String[] a1 = str1.split("");

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);



        boolean isAnagram = Arrays.equals(ch1, ch2);
        System.out.println("isAnagram = " + isAnagram);


    }
}
/*
Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false


        listen  silent
 */