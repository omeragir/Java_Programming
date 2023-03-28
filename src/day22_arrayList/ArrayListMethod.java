package day22_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(20);
        list.add(30);
        //list.add(5.5) Integer assign

        System.out.println(list);

        list.add(1, 15);//we add index number and element
        list.add(2, 25);

        System.out.println(list);
        System.out.println("----------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("John");
        studentsList.add("Emily");
        studentsList.add("July");
        studentsList.add("Daniel");

        System.out.println(studentsList.size());

        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);
        System.out.println(firstStudent);

        String lastStudent=studentsList.get(studentsList.size()-1);
        System.out.println(lastStudent);

    }
}
