package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Student student=new Student("Emily",'F', LocalDate.of(1990,5,16),'A',"E22");

        President president=new President("Daniel",'M',LocalDate.of(1980,12,1),LocalDate.of(2020,5,15));

        Teacher teacher=new Teacher("Lucy",'F',LocalDate.of(1985,11,1),'A',"L25","Math Teacher","MT25",25000);

        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("------------------");

        student.eat("Baklava");
        teacher.drink("Water");


    }
}
