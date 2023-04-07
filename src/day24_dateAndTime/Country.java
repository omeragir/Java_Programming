package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Country {
    public static void main(String[] args) {

        ArrayList<String>name=new ArrayList<>(Arrays.asList("Australia", "Canada", "Bosnia and Herzegovina", "Spain","Argentina", "Malta", "United States of America", "Italy"));

        name.removeIf(p->p.length()>=10);

        System.out.println(name);

    }
}
/*
Write a program that can remove string elements from an arraylist if the first and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		[Canada, Lan, Ebrahim, Farida]
 */