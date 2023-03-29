package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Apples");
        groceriesList.add("paper Towels");
        groceriesList.add("Cooking oil");
        System.out.println(groceriesList);

        groceriesList.set(1, "Orange");//          set method
        System.out.println(groceriesList)
        ;
        groceriesList.add(1, "Apple");   //   add method
        System.out.println(groceriesList);

        System.out.println("-----------------------------------");

        groceriesList.remove(0);//      remove method index
        System.out.println(groceriesList);

        groceriesList.remove("Apple");//   remove method object
        System.out.println(groceriesList);
        System.out.println("-----------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(1);// remove index
        System.out.println(numbers);

        boolean r1 = numbers.remove(Integer.valueOf(10));// remove integer object (we assign boolean)
        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();   //Clear Method Array list size zero
        System.out.println(numbers);


        System.out.println("-----------------------------------");
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emily");
        names.add("Emily");
        names.add("Ali");
        names.add("Emily");
        System.out.println(names.indexOf("Emily"));//index of method first matching give
        System.out.println(names.lastIndexOf("Ali"));//last index of method
    }
}
