package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        //array[5]= 60;
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());

        list.add(2);
        System.out.println(list);
    }
}
