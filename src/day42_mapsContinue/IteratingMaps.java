package day42_mapsContinue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();//random order,accept null key
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        //Iterating the map by the keys

        for (String eachKey : map.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println("-----------------------");

        System.out.println(map);

        for (String eachKey : map.keySet()) {
            map.replace(eachKey,map.get(eachKey)*2);
        }
        System.out.println(map);
        System.out.println("-------------------------------");

        //Iterating the map by the value

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }
        System.out.println("-------------------------------");

        //Iterating the map by the entries/pairs

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }
        System.out.println("-------------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
           String eachKey= eachEntry.getKey();

          Integer eachValue= eachEntry.getValue();

          eachEntry.setValue(eachValue+10000);

            System.out.println("eachValue = " + eachValue);

            System.out.println("eachKey = " + eachKey);
        }

        System.out.println(map);

    }
}
