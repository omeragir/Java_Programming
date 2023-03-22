package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergedTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------");
        int[] a = {10, 20, 30, 40, 50, 60};
        int[] b = {70, 80, 90};

        int[] c = ArraysUtility.merge(a, b);
        System.out.println(Arrays.toString(c));
        System.out.println("---------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.merge(b1, b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("---------------------------");

        char[] ch1 = {'A', 'b', 'c', 'd'};
        char[] ch2 = {'X', 'Y', 'Z'};

        char[] ch3 = ArraysUtility.merge(ch1, ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------");


        String[] c1 = {"Java", "Python", "Ruby"};
        String[] c2 = {"C#", "C++", "Swift"};
        String[] c3 = ArraysUtility.merge(c1, c2);
        System.out.println(Arrays.toString(c3));

    }
}
/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */