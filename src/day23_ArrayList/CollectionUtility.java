package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {         //Collection method

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        int max = Collections.max(list);//max method
        int min = Collections.min(list);//min method

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("--------------------------------------");

        ArrayList<String> items=new ArrayList<>();//sort method
        items.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice"));
        Collections.sort(items);
        System.out.println(items);
        System.out.println("------------------------------");

        Collections.reverse(items);//reverse method
        System.out.println(items);

        System.out.println("------------------------------");

        ArrayList<String> developers = new ArrayList<>();  //swap method
        developers.addAll(Arrays.asList("Alena", "Muhtar", "GAdir", "Ali"));

        System.out.println(developers);

        Collections.swap(developers,0,2);

        System.out.println(developers);

        Collections.swap(developers,0,developers.size()-1);
        System.out.println(developers);








    }
}
