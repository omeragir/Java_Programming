package day40_collectionContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));


        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.hasNext());


        System.out.println("------------------------------------");
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmed", "John", "Ercan", "Daniel", "Mohammed", "Ahmed", "Emily"
        ));

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each=it.next();
            if (each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("---------------------------------");

        names.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names);


    }
}
