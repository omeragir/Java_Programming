package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpace {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        str = str.trim();

        String[] word = str.split(" ");


        System.out.println(Arrays.toString(word));
        str = "";

        for (String each : word) {

            if(!each.isEmpty()){
                str+=each+" ";
            }

        }
        str=str.trim();
        System.out.println(str);


    }
}
/*
Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java

 */