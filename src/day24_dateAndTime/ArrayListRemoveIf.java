package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println("----------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));


        System.out.println(list2);

        list2.removeIf(p -> p < 4);
        System.out.println(list2);

    }
}
/*
Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */