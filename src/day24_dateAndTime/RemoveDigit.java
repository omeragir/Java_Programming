package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDigit {
    public static void main(String[] args) {

        ArrayList<Character>characters=new ArrayList<>(Arrays.asList('$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        characters.removeIf(p->Character.isDigit(p));
        System.out.println(characters);

    }
}
/*
Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */