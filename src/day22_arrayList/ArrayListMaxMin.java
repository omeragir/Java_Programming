package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = list.get(0);
        int min = list.get(0);

        for (Integer each : list) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */