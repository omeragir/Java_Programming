package day19_array;

import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};


        for (int i = 0; i < arr1.length; i++) {
            String common = "";

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common = arr1[i] + " ";
                }

            }

            System.out.print(common);


        }
    }
}
/*
        Write a program that can print out the common elements from two integer array
        Ex:
        arr1: {1,2,3,4,5}
        arr2: {4,5,6,7,8}

        output:
        4 5}

 */