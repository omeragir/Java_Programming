package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : num) {

            if (each % 2 != 0) {
                System.out.print(each + " ");
            }

        }
        System.out.println("-----------------------------------------");

        int[] numbers = {100, 20, 30, 40, 1, 2, 3, 4, 5, 6, 5000};
        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers) {

            if (each > max) {
                max = each;
            }
        }
        for (int each1 : numbers) {
            if (each1 < min) {
                min = each1;
            }

        }
        System.out.println("min = " + min);
        System.out.println("max" + max);
        System.out.println("------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60,};
        int[] a2 = {70, 80, 90};
        int[] a3 = new int[a1.length + a2.length];

        int k=0;

        for (int each : a1) {
            a3[k++]=each;
        }
        for (int each : a2) {
            a3[k++]=each;
        }
        System.out.println(Arrays.toString(a3));
        System.out.println("------------------------------");

        String [] names={"Ahmet mehmet","Veli deli","John lay","Vasyl dem","Rahmi sen"};
        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));
        }








    }
}
