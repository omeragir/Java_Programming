package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 75;
        int score3 = 70;
        int score4 = 90;
        int score5 = 65;

        System.out.println("---------------------------------");

        int[] score = new int[5];
        score[2] = 78;
        score[0] = 55;
        score[1] = 95;
        score[3] = 80;
        score[4] = 65;


        System.out.println(Arrays.toString(score));

        System.out.println(score[2]);

        System.out.println("---------------------------------");


        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println("---------------------------------");

        System.out.println(score[score.length-1]);

        System.out.println("---------------------------------");







    }
}
