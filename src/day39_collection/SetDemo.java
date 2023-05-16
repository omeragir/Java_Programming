package day39_collection;


import java.util.*;


public class SetDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 10, 200));
        list.addAll(Arrays.asList(10, 200, 300, 40, 10, 200));
        list.addAll(Arrays.asList(10, 200, 300, 40, 10, 200));
        list.addAll(Arrays.asList(10, 200, 300, 40, 10, 200));
        list.addAll(Arrays.asList(10, 200, 300, 40, 10, 200));


        System.out.println("------------------");

        Set<Integer> set1 = new HashSet<>();

        set1.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set1.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set1.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set1.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set1.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));

        System.out.println(set1);
        System.out.println("------------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set2.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set2.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2);

        System.out.println("------------------");

        String str = null;
        // System.out.println(str.toLowerCase());

        Set<Integer> set3 = new TreeSet<>();

        set3.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set3.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        set3.addAll(Arrays.asList(100, 200, 300, 10, 40, 200));
        //   set3.addAll(Arrays.asList(null,null,null,null));

        System.out.println(set3);
        System.out.println("-----------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C#", "Ruby"};
        Set<String> result = new LinkedHashSet<>();

        result.addAll(Arrays.asList(words));
        System.out.println(result);


        words = result.toArray(new String[0]);
        System.out.println("Words Array: "+Arrays.toString(words));

        System.out.println("-------------------------");
/*
        for (String each : result) {
            System.out.println(each);
        }

 */

        System.out.println(new ArrayList<>(result).get(1));
        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10, 10, 10, 10, 20, 20, 20, 40, 40, 50, 60, 70, 20, 20, 70, 70, 80, 80, 90));
        Set<Integer> num = new TreeSet<>(numbers);
        System.out.println(num);

    }
}
