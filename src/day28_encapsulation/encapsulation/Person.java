package day28_encapsulation.encapsulation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(LocalDate.from(dateOfBirth.atStartOfDay()));
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }

    public String getName() {
        if (name == null) {
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty() || name == null) {
            System.err.println("Person name can not be empty, blank or null");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.err.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid date if birth "+dateOfBirth);
        }

            this.dateOfBirth = dateOfBirth;
    }
}
/*
name,age,gender,dateOfBirth

write name: name =can not be null /empty/blank
read=if name null return unknown

age:
write: can not zero or greater than 120

gender:
write: gender can only be 'M' or 'F'

dateOfBirth:
write: can not be after today's date

add a constructor that can set all the fields
add toString()


 */