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
Create an ArrayList of string called country names,
write a program that can remove all the country names that have length of 10 or greater
 */