package day42_mapsContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeesMap = new HashMap<>();
        employeesMap.put("Ddene", "F");
        employeesMap.put("Winfred", "M");
        employeesMap.put("Jereme", "M");
        employeesMap.put("Glad", "F");
        employeesMap.put("Desire", "F");
        employeesMap.put("Kakalina", "F");
        employeesMap.put("Bertrando", "M");
        employeesMap.put("Ajay", "F");
        employeesMap.put("Brigitte", "F");
        employeesMap.put("Derk", "M");
        employeesMap.put("Orlando", "M");
        employeesMap.put("Selle", "F");
        employeesMap.put("Marika", "F");

        System.out.println("--------------------------------");
        //How many male and female employees in the map?

        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;
/*
        for (String name : employeesMap.keySet()) {

            String gender = employeesMap.get(name);

            if (gender.equals("M")){
                countMaleEmployees++;
            }else {
                countFemaleEmployees++;
            }

        }

 */

        for (String eachValue : employeesMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployees++;
            } else {
                countMaleEmployees++;
            }
        }
        System.out.println("Female Employees = " + countFemaleEmployees);
        System.out.println("Male Employees = " + countMaleEmployees);
        System.out.println("--------------------------------");

        //display the names of all the female employees
        /*
        for (String names : employeesMap.keySet()) {
            String gender=employeesMap.get(names);
            if (gender.equals("F")){
                System.out.println(names);
            }
        }

         */

        for (Map.Entry<String, String> eachEntry : employeesMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                System.out.println(eachEntry.getKey());
            }
        }


        System.out.println("--------------------------------");
        // update all the "M value with "Male","F" values with " Female "

        for (Map.Entry<String, String> eachEntry : employeesMap.entrySet()) {
            if (eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else {
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeesMap);
        System.out.println("--------------------------------");





    }
}
