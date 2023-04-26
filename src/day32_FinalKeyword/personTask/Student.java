package day32_FinalKeyword.personTask;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;

    public Student(String name, char gender, int age, LocalDate dateOfBirth, char grade) {
        super(name, gender, age, dateOfBirth);
        this.grade = grade;
    }


}
