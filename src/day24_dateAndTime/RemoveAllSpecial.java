package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllSpecial {
    public static void main(String[] args) {
        ArrayList<Character>characters=new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        characters.removeIf(p->!Character.isLetterOrDigit(p));
        System.out.println(characters);

    }
}
/*
Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']

	Note: DO NOT use any loops

 */