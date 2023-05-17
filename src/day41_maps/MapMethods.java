package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("E21", "Emily");
        map.put("J18", "John");
        map.put("D22", "Daniel");
        map.put("A25", "Abidin");
        map.put("T19", "Tatiana");
        map.put("A29", "Tatiana");
        map.put("B19", "Tatiana");
        map.put("C19", "Tatiana");
        map.put("D19", "Tatiana");

        System.out.println(map.size());

        System.out.println(map.get("A29"));

        map.put("A29", "Lucy");

        map.put("B19", "Bahtiyar");

        System.out.println(map);

        System.out.println(map.get("D19"));

        map.replace("D19", "Nora");

        System.out.println(map.get("D19"));

        map.remove("C19");

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey("B19"));

        System.out.println(map.containsKey("H01"));

        System.out.println(map.containsValue("Lucy"));

        System.out.println(map.isEmpty());

        System.out.println(map.equals(map));

        map.clear();

        System.out.println(map.size());


    }
}
/*
pairs : id - name




 */