package day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr2D={ {10, 20, 30},{40, 50, 60, 70},  {80, 90}};

        for (int i = 0; i < arr2D.length; i++) {
            
            int[] each1D=arr2D[i];
            
            System.out.println(Arrays.toString(each1D));
            
            for (int j = 0; j < each1D.length; j++) {
                
                int eachElement=each1D[j];
                
                System.out.println(eachElement);


            }
        }

        System.out.println("----------------------------");

        for (int[] each1dArray : arr2D) {
            System.out.println(Arrays.toString(each1dArray));
            for (int element : each1dArray) {
                System.out.println(element);

            }
            
        }
        
        
        
        
        
        
        
        
    }
}
