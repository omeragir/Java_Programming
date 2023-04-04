package day25_constructor;

import java.time.LocalDate;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    }// allows us to set all the instance variable of the object as soon as the  object created

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_date=" + hired_date +
                '}';
    }// allows us to print the object when it's passed in the print statement




}
/*
name
age
gender
job title
salary
hire- date

 */