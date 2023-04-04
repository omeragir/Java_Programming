package day25_constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    boolean isMarried;
    boolean isEmployee;

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployee) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployee = isEmployee;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("EEEE,MMMM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployee=" + isEmployee +
                '}';
    }

    public void eat(String eatName){
        System.out.println("Employee eat: "+eatName);
    }

    public void sleep(){
        System.out.println("Employee sleep minimum 8 hours");
    }

    public void drink(String drinkName){
        System.out.println("Employee drink : "+drinkName);
    }


}
/*
name,age,gender,dateOfBirth,isMarried,isEmployee

Add a constructor that can set all the fields once an object is created

toString();, eat(String food),sleeping(),drink(String drink)
 */