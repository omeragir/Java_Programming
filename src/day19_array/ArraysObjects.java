package day19_array;

import java.util.Arrays;

public class ArraysObjects {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[0]=100;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("--------------------------------------");

        String[]a1={"Umran","Daniel"};
        a1= new String[]{"Mehmet","Ahmet"};

        System.out.println(Arrays.toString(a1));






    }
}
