package day40_collectionContinue;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 300, 100, 300));
        System.out.println(collection);

        System.out.println(((ArrayList<Integer>) collection).get(2));

        //  System.out.println(((Stack)collection).pop());
        System.out.println("-----------------");

        Collection<Integer> collection2 =new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 300, 100, 300,400,700,800));
        System.out.println(collection2);

       // System.out.println(((ArrayList) collection2).get(4) );
        System.out.println(new ArrayList<>(collection2).get(4));

        List<Integer>list=new ArrayList<>(collection2);




    }

}
