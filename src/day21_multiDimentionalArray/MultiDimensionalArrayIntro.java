package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70};
        int[] arr3 = {80, 90};
        int[] arr4={100,110,120};

        System.out.println("-------------------------------");

        int[][] arr2D={ {10, 20, 30},{40, 50, 60, 70},  {80, 90}, arr4 };
        System.out.println(arr2D.length);
        System.out.println(arr2D[2][0]);


    }
}
