package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();//random order,accept null key
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        // map.put("Daniel",70000);//last one print,duplicate accept not
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        System.out.println("hashMap = " + hashMap);

        System.out.println("----------------------------------------------");


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//insertion order,accept null key

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // linkedHashMap.put("Daniel",70000);//
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("----------------------------------------------");


        Map<String, Integer> treeMap = new TreeMap<>();//sorted order,does not accept null key,accept null value
        //key sorted

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // treeMap.put("Daniel",70000);//
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);//value can be null
        // treeMap.put(null,120000);//key can not be null
        //treeMap.put(null,110000);

        System.out.println("treeMap = " + treeMap);

        System.out.println("----------------------------------------------");


        Map<String, Integer> hashTable = new Hashtable<>();//random order,does not accept null key & null value ,Synchronized

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        // hashTable.put("Daniel",70000);//
        hashTable.put("Arron", 78000);
        //hashTable.put("Chris", null);//value can not be null
        //  hashTable.put(null, 120000);//key can not be null

        try {
            hashTable.put("Diana", 110000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("hashTable = " + hashTable);

    }
}
/*
pair=name&salary
Daniel=95000
Emily=100000
Bella=85000
 */