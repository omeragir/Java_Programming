package day42_mapsContinue;

import java.util.*;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, Object>car1=new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year",2021);
        car1.put("color","Red");
        car1.put("price",45000.5);

        Map<String, Object>car2=new LinkedHashMap<>();

        Map<String, Object>car3=new LinkedHashMap<>();

        Map<String, Object>car4=new LinkedHashMap<>();

        List<Map<String,Object>>cars=new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3,car4));




    }
}
