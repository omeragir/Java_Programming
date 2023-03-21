package day19_array;

public class ArrayMaxMinNumber {
    public static void main(String[] args) {

        int[] number = {100, 20, 500, 40, -10, 30};
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {

            if (max < number[i]) {
                max = number[i];
            }

        }

        for (int i = 0; i < number.length; i++) {
            if(min>number[i]){
                min=number[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
