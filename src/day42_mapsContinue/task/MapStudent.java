package day42_mapsContinue.task;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapStudent {
    public static void main(String[] args) {

        Map<String,Integer> student1=new LinkedHashMap<>();
        student1.put("Ali",5);
        System.out.println(student1);

        Map<String,Integer> student2=new LinkedHashMap<>();
        student1.put("Emily",4);

        Map<String,Integer> student3=new LinkedHashMap<>();
        student1.put("John",3);

        Map<String,Integer> student4=new LinkedHashMap<>();
        student1.put("Veli",2);

        Map<String,Integer> student5=new LinkedHashMap<>();
        student1.put("Zeliha",1);

        Map<String,Integer>[]studentScores=new Map[5];
        studentScores[0]=student1;
        studentScores[1]=student2;
        studentScores[2]=student3;
        studentScores[3]=student4;
        studentScores[4]=student5;

        System.out.println(Arrays.toString(studentScores));

    }
}
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */