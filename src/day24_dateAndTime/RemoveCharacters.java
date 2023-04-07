package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCharacters {
    public static void main(String[] args) {

        ArrayList<Character>characters=new ArrayList<>(Arrays.asList('$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        characters.removeIf(p->Character.isLetter(p));

        System.out.println(characters);

    }
}
/*
Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
 */