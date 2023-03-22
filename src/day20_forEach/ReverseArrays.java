package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];


        }
        System.out.println(Arrays.toString(reverse));
        System.out.println("--------------------------------");


        double[] a1={5.5,2.3,3.3,9.8};

        a1=ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println("--------------------------------");

        char[]ch1={'a','b','c','g','r'};
        char[] ch2=ArraysUtility.reverse(ch1);
        System.out.println(Arrays.toString(ch2));
        System.out.println("--------------------------------");




    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */