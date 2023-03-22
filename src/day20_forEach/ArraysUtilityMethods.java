package day20_forEach;

import java.util.Arrays;

public class ArraysUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result);
        System.out.println("-------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);

        char[] ch1 = {'c', 'b', 'a'};
        char[] ch2 = {'a', 'c', 'b'};

        boolean r2 = Arrays.equals(ch1, ch2);
        System.out.println(r2);
        System.out.println("-------------------------------");

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};
        System.out.println(Arrays.equals(s1, s2));
        System.out.println("-------------------------------");

        int[] nums = {100, 80, 90, 65, 78, 25, 12, 3, 12, 45};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);//sort
        System.out.println(Arrays.toString(nums));
        System.out.println("Min num: " + nums[0]);
        System.out.println("Max num: " + nums[nums.length - 1]);

        System.out.println("-------------------------------");

        String[] s3 = {"A", "B", "C"};
        String[] s4 = {"A", "C", "B"};
        Arrays.sort(s3);
        Arrays.sort(s4);
        System.out.println(Arrays.equals(s3, s4));
        System.out.println("-------------------------------");

        String[] students = {"Yasar", "Ali", "Veli", "Alena", "John"};
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        int[] array = {10, 20, 30, 40, 50, 60, 70};

        int[] array1 = Arrays.copyOf(array, 10);

        System.out.println(Arrays.toString(array1));
        System.out.println("-------------------------------");

        int[] num1 = {1, 2, 3, 4, 5, 6};
        int[] num2 = {10, 20, 30, 40, 50, 60, 21};
        int[] num3 = Arrays.copyOf(num1, num1.length + num2.length);
        for (int i = 0, j = num1.length; i < num2.length; i++, j++) {
            num3[j] = num2[i];
        }
        System.out.println(Arrays.toString(num3));
        System.out.println("-------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] result1 = Arrays.copyOf(ch, 10);

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2, 5);//excludes ending index

        System.out.println(Arrays.toString(result2));

        char[] result3 =Arrays.copyOfRange(ch,2,ch.length);

        System.out.println(Arrays.toString(result3));




    }
}
