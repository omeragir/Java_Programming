package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {
    public static void main(String[] args) {

        ArrayList<Integer>number=new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));
        number.removeIf(p->p==Collections.max(number)||p==Collections.min(number));

        System.out.println("Second max number is :" +Collections.max(number));
        System.out.println("Second min number is : "+Collections.min(number));

    }
}
/*
Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */