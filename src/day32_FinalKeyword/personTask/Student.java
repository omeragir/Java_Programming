package day32_FinalKeyword.personTask;

import java.time.LocalDate;

public class Student extends Person{

    private char grade;

    public Student(String name, char gender,  LocalDate dateOfBirth, char grade) {
        super(name, gender, dateOfBirth);
        this.grade = grade;
    }


}
