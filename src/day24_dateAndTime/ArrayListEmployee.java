package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDETs", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        for (Employee each : employees) {
            System.out.println(each.name + " : " + each.jobTitle);

        }
        System.out.println("-------------------------------------------------");

        for (Employee eachJob : employees) {
            if (eachJob.jobTitle.equals("Java Developer")) {
                System.out.println(eachJob.name);

            }
        }
        System.out.println("-------------------------------------------------");

        double max = employees.get(0).salary;
        double min = employees.get(0).salary;

        for (Employee eachSalary : employees) {
            if (eachSalary.salary > max) {
                max = eachSalary.salary;
            }
            if (eachSalary.salary < min) {
                min = eachSalary.salary;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("-------------------------------------------------");

        ArrayList<Employee>femaleEmployee=new ArrayList<>();
        ArrayList<Employee>maleEmployee=new ArrayList<>();

        for (Employee eachGender : employees) {
            if (eachGender.gender=='M'){
                maleEmployee.add(eachGender);
            }else {
                femaleEmployee.add(eachGender);
            }
        }
        System.out.println("Total number of female employees : "+femaleEmployee.size());
        System.out.println("Total number of male employees : "+maleEmployee.size());


    }
}
/*
Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a progam that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists
 */