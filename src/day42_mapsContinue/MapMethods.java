package day42_mapsContinue;


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

        Map<String,String>employees=new TreeMap<>();
        employees.putAll(map);

        System.out.println(map);

        System.out.println(map==employees);//false

        System.out.println(map.equals(employees));//true


    }
}
