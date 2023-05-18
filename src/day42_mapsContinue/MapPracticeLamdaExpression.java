package day42_mapsContinue;

import java.util.Map;
import java.util.TreeMap;

public class MapPracticeLamdaExpression {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("E21", "Emily");
        map.put("J18", "John");
        map.put("D22", "Daniel");
        map.put("A25", "Abidin");
        map.put("T19", "Tatiana");

        map.forEach((k, v) -> { System.out.println(k+" : "+v); });

    }

}
