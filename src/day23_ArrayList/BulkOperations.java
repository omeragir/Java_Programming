package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addAll(1, numbers);//  addAll method

        System.out.println(list);
        System.out.println("-------------------------------");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));// addAll method with asList
        System.out.println(scores);

        System.out.println("-------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("GAdir", "John", "Emily", "Hasan", "Bilal"));// addAll method with asList String
        System.out.println(students);

        students.addAll(2, Arrays.asList("July", "Jacky")); //addAll method later convert

        System.out.println(students);
        System.out.println("-------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};//must non-primitive array

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));//2.Approach addAll Array

        // 1.approach=> l1.addAll(Arrays.asList(nums));//addAll method Array
        System.out.println(l1);
        System.out.println("-------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alena", "Muhtar", "GAdir", "Ali"));
        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");// containsAll method
        boolean hasAlenaAli = employeesList.containsAll(Arrays.asList("Alena", "Ali"));
        boolean hasMuhtarKuzzatAli = employeesList.containsAll(Arrays.asList("Muhtar", "Ali", "Kuzzat"));
        System.out.println("hasAlenaAli = " + hasAlenaAli);
        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasMuhtarKuzzatAli = " + hasMuhtarKuzzatAli);
        System.out.println("--------------------------------");

        ArrayList<Integer>list1 =new ArrayList<>();
        list1.addAll(Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));

        list1.removeAll(Arrays.asList(10,20));//remove all method
        System.out.println("list1 = " + list1);
        System.out.println("------------------------------------");

        ArrayList<String> developers = new ArrayList<>();  //retainAll method
        developers.addAll(Arrays.asList("Alena", "Muhtar", "GAdir", "Ali", "Muhtar","Muhtar","Alena"));
        developers.retainAll(Arrays.asList("Alena","Muhtar"));
        System.out.println("developers = " + developers);
        System.out.println("---------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice"));
        groceriesList.retainAll(Arrays.asList("Eggs","Potato"));
        System.out.println(groceriesList);






    }
}
