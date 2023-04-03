package day24_dateAndTime;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {

        Person[] people={ new Person(),new Person(),new Person(),new Person(),new Person() };
        people[0].setInfo("Emily",'F', LocalDate.of(1989,2,25));
        people[1].setInfo("Daniel",'M', LocalDate.of(1985,7,5));
        people[2].setInfo("John",'M', LocalDate.of(1960,8,12));
        people[3].setInfo("Sara",'F', LocalDate.of(1979,9,2));
        people[4].setInfo("Anastasia",'F', LocalDate.of(2000,12,30));

        ArrayList<Person> students=new ArrayList<>();
        students.addAll(Arrays.asList(people));

        for (Person each : people) {

            System.out.println(each.name+" birth day is "+ each.dateOfBirth);

        }
        System.out.println("******");

        students.removeIf(p-> p.age>55);
        for (Person element : students) {
            System.out.println(element);
            System.out.println();
        }


    }
}
