package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String [] studentsName=new String[5];
        studentsName[0]="Mike";
        studentsName[1]="John";
        studentsName[2]="James";
        studentsName[3]="Emily";
        studentsName[4]="Hans";

        System.out.println(Arrays.toString(studentsName));

        System.out.println("----------------------------------");

        for (int i = studentsName.length-1; i >=0 ; i--) {
            System.out.println(studentsName[i]);

        }

        System.out.println("----------------------------------");







        }
}
