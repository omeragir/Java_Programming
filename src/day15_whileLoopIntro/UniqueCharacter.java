package day15_whileLoopIntro;

public class UniqueCharacter {
    public static void main(String[] args) {
        String input = "AABCCD";

        for (int i = 0; i < input.length(); i++) {
            int unique = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j) && i != j) {
                    unique = 1;
                    break;
                }
            }
            if (unique == 0)
                System.out.println(input.charAt(i));
        }
    }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
 */