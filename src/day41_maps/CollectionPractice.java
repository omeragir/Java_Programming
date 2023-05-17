package day41_maps;

import day33_abstraction.employeeTask.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(6, 7, 8, 9,10,11));


        List<List<Integer>> lists = new ArrayList<>();
        //lists.addAll(Arrays.asList(list1, list2));

        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);

        //10
        System.out.println(lists.get(1).get(4));

        for (List<Integer> each : lists) {
            for (Integer eachElement : each) {
                System.out.println(eachElement);
            }
        }

        System.out.println("-----------------------------");

        List<Set<Integer>>listOfSet=new ArrayList<>();
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());
        listOfSet.add(new LinkedHashSet<>());


        System.out.println(listOfSet);

        //{10,5,20}
        listOfSet.get(0).addAll(Arrays.asList(10,5,20,10,5,20));//Duplicate are not allowed
        listOfSet.get(1).addAll(Arrays.asList(30,15,40));
        listOfSet.get(2).addAll(Arrays.asList(300,1,5));

        System.out.println(listOfSet);

        System.out.println("------------------------");

        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8,9,10};

        List<int[]>listOfArray=new ArrayList<>();
        listOfArray.add(arr1);
        listOfArray.add(arr2);

        listOfArray.get(0)[2]=35;
        System.out.println(Arrays.toString(listOfArray.get(0)));

        System.out.println("------------------------");

        //List<List<Employee>>team=new ArrayList<>();







        //List<int[][]>l=new ArrayList<>();



    }
}
