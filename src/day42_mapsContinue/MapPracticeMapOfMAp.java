package day42_mapsContinue;

import day33_abstraction.employeeTask.Developers;
import day35_polymorphism.transportationTask.Car;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPracticeMapOfMAp {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 33);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

        System.out.println(person1);


        Map<String, Object> person2 = new LinkedHashMap<>();

        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-end Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 8, 05));
        person2.put("married", true);

        System.out.println(person2.get("name"));
        System.out.println(person2.get("job_title"));

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Emily");
        person3.put("gender", 'F');
        person3.put("age", 22);
        person3.put("job_title", "SDETs");
        person3.put("salary", 85000);
        person3.put("hired_date", LocalDate.of(2022, 9, 25));
        person3.put("married", true);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Iskender");
        person4.put("gender", 'M');
        person4.put("age", 31);
        person4.put("job_title", "Front-end Developer");
        person4.put("salary", 91000);
        person4.put("hired_date", LocalDate.of(2021, 8, 5));
        person4.put("married", true);

        Map<String, Object> person5 = new LinkedHashMap<>();

        person5.put("name", "Lucy");
        person5.put("gender", 'F');
        person5.put("age", 25);
        person5.put("job_title", " Developer");
        person5.put("salary", 100000);
        person5.put("hired_date", LocalDate.of(2022, 5, 15));
        person5.put("married", true);

        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();
        mapOfMaps.put(0, person1);
        mapOfMaps.put(1, person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);
        mapOfMaps.put(4, person5);

        //mapOfMaps.putAll();


        System.out.println(mapOfMaps);

        mapOfMaps.get(1).replace("salary", 110000);

        System.out.println(mapOfMaps.get(1));
        System.out.println("-----------------------------");

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            System.out.println(eachValue);
        }
        System.out.println("-----------------------------");

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if (eachEntry.getKey().equals("salary")) {
                    eachEntry.setValue((Integer) eachEntry.getValue() + 10000);
                }
            }
        }
        System.out.println(mapOfMaps);
        System.out.println("-----------------------------");

        Map<Map<String, Integer>, Map<String, Integer>> mapOfMap2 = new LinkedHashMap<>();

        Map<int[], List<Integer>> map2 = new LinkedHashMap<>();

        Map<Developers, Car> map3 = new LinkedHashMap<>();


    }
}
