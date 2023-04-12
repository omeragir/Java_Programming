package day28_encapsulation.encapsulation;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1=new Person( "Emily",22,'F', LocalDate.of(2021,12,5));
        System.out.println(person1);
    }
}
