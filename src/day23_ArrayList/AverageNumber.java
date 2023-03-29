package day23_ArrayList;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        double average= sum/list.size();

        System.out.println(average);
        System.out.println("-----2. Solve------------------");
        for (Integer each : list) {
            sum+=each;
        }
        System.out.println(average);

    }
}
//Write a program that can find the average number from an arrayList of integers