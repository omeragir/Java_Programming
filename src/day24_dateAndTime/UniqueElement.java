package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer>num=new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        num.removeIf(p-> Collections.frequency(num,p)>1);
        System.out.println(num);


    }
}
/*
Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops

 */