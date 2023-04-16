package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate dateOfBirth, char grade, String studentId, String jobTitle, String employeeId, double salary) {
        super(name, gender, dateOfBirth, grade, studentId, jobTitle, employeeId, salary);
    }

    public void teach(){
        System.out.println(getName()+" is teaching");
    }


}
