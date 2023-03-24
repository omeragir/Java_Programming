package day19_array;

import java.util.Arrays;

public class MovesZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] reversArrays = new int[array.length];

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {
            reversArrays[k] = array[i];
        }
        System.out.println(Arrays.toString(reversArrays));

    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */