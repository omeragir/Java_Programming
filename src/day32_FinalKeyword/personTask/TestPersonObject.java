package day32_FinalKeyword.personTask;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {
        Person person=new Person("Daniel",'M', LocalDate.of(2000,12,5));

        System.out.println(person);

        Employee employee=new Employee("Emily",'F',LocalDate.of(1989,2,5),"SDETs",55000);
        System.out.println(employee);

        person.breath();
        employee.breath();

    }

}
