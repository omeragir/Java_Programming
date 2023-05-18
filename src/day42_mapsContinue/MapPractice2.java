package day42_mapsContinue;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String,Object> person1=new LinkedHashMap<>();

        person1.put("name","Arthur");
        person1.put("gender",'M');
        person1.put("age",33);
        person1.put("job_title","Developer");
        person1.put("salary",100000);
        person1.put("hired_date", LocalDate.of(2021,1,15));
        person1.put("married",true);

        System.out.println(person1);


        Map<String,Object> person2=new LinkedHashMap<>();

        person2.put("name","Nora");
        person2.put("gender",'F');
        person2.put("age",31);
        person2.put("job_title","Back-end Developer");
        person2.put("salary",90000);
        person2.put("hired_date", LocalDate.of(2022,8,05));
        person2.put("married",true);

        System.out.println(person2.get("name"));
        System.out.println(person2.get("job_title"));

        Map<String,Object> person3=new LinkedHashMap<>();
        person3.put("name","Emily");
        person3.put("gender",'F');
        person3.put("age",22);
        person3.put("job_title","SDETs");
        person3.put("salary",85000);
        person3.put("hired_date", LocalDate.of(2022,9,25));
        person3.put("married",true);

        Map<String,Object> person4=new LinkedHashMap<>();
        person4.put("name","Iskender");
        person4.put("gender",'M');
        person4.put("age",31);
        person4.put("job_title","Front-end Developer");
        person4.put("salary",91000);
        person4.put("hired_date", LocalDate.of(2021,8,5));
        person4.put("married",true);

        Map<String,Object> person5=new LinkedHashMap<>();

        person5.put("name","Lucy");
        person5.put("gender",'F');
        person5.put("age",25);
        person5.put("job_title"," Developer");
        person5.put("salary",100000);
        person5.put("hired_date", LocalDate.of(2022,5,15));
        person5.put("married",true);


        List<Map<String,Object>>listOfMap=new ArrayList<>();
        listOfMap.add(person1);
        listOfMap.add(person2);


        listOfMap.addAll(Arrays.asList(person3,person4,person5));

        System.out.println(listOfMap);
        System.out.println("-------------------------------------");

        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }
        System.out.println("-------------------------------------");
        // display the names of the employee who are hired this year (2022)

        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hired_date")){
                    if (((LocalDate)eachEntry.getValue()).getYear()==2022){
                       // System.out.println(eachEntry);
                        System.out.println(eachMap.get("name"));
                    }
                }
            }
        }
        System.out.println("-------------------------------------");

        listOfMap.get(0).replace("name","Vasily");
        listOfMap.get(listOfMap.size()-1).replace("salary", ((Integer)listOfMap.get(listOfMap.size()-1).get("salary"))+5000);

        listOfMap.get(1).replace("age", ((Integer)listOfMap.get(1).get("age"))+4 );


        System.out.println(listOfMap);


    }
}
