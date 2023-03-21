package day19_array;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] num = {1, 2, 3, 4, 5};

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("num = " + Arrays.toString(num));

        System.out.println("-----------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int n = 1;

        System.out.println(days[n - 1]);
        System.out.println("-----------------------------------");

        for (int i = 1; i <= days.length; i++) {
            System.out.println(days[i - 1]);
        }
        System.out.println("-----------------------------------");

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("Arrays.toString(months) = " + Arrays.toString(months));

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);

        }

        System.out.println("-----------------------------------");

        int[] numbers2 = new int[100];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers2));


    }
}
