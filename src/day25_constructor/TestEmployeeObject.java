package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("John",35,'M',"SDETs",65000, LocalDate.of(2022,12,2));

        Employee employee2=new Employee("Emily",25,'F',"Java Developer",70000,LocalDate.of(2023,2,21));

        Employee employee3=new Employee("Kenan",38,'M',"SDETs",63000,LocalDate.of(2021,5,18));

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }
}
