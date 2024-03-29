package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr2D1={ {1,2},{3,4,5} };
        int[][] arr2D2={ {6,7,8,9},{10,11},{12,13,14} };
        int[][] arr2D3={ {15,16,17,18} };

        int[][][] arr3D={  {{1,2},{3,4,5}} , {{6,7,8,9},{10,11},{12,13,14}}, {{15,16,17,18}}  };

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][1]));

        System.out.println(Arrays.toString(arr3D[1][0]));

        System.out.println(arr3D[1][2][2]);

        System.out.println(arr3D[2][0][3]);

        System.out.println("------------------------------------");

        for (int i = 0; i < arr3D.length; i++) {
            int[][] each2DArray=arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) {
                int[] each1DArray=each2DArray[j];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) {
                    int eachElement=each1DArray[k];
                    System.out.println(eachElement);
                }
            }

        }

























    }
}
