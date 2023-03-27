package day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalArray_vs_TwoDimensionalArray {

    public static void main(String[] args) {
        int[] arr1=new int[10];
        System.out.println(Arrays.toString(arr1));

        int[]a1={1,2,3,4,5};
        int[]a2={6,7,8};
        int[]a3={9,10};
        int[]a4={11,12,13,14,15};
        int[]a5={16,17,18,19,20,21};



        int[][] arr2=new int[5][];
        arr2[0]=a1;
        arr2[1]=a2;
        arr2[2]=a3;
        arr2[3]=a4;
        arr2[4]=a5;

        System.out.println(Arrays.deepToString(arr2));

    }
}
