package day15_whileLoopIntro;

public class FrequencyOfChar {
    public static void main(String[] args) {
        int counter = 0;
        String str = "Java programming language";
        char ch = 'g';

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                counter++;
            }

        }
        System.out.println(counter);

    }
}
/*
Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */