package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrayList {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list=new ArrayList<>();
        list.add(Arrays.toString(arr1).replace("[","").replace("]",""));
        list.add(Arrays.toString(arr2).replace("[","").replace("]",""));

        System.out.println(list);





    }
}
/*
write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */