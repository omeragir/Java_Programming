package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Emily");
        names.add("Emily");
        names.add("Ali");
        System.out.println(names);


        ArrayList<String> nonDup=new ArrayList<>();

        for (String each : names) {
            if (nonDup.contains(each)){
                continue;
            }
            nonDup.add(each);

        }
         // names=nonDup;
        System.out.println(names);
        System.out.println(nonDup);

    }
}
