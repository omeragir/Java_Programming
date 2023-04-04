package day25_constructor;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1=new Person("Emily",34,'F', LocalDate.of(1988,1,1),false,true);
        Person person2=new Person("John",23,'M', LocalDate.of(2000,11,10),true,false);
        Person person3=new Person("Sare",30,'F', LocalDate.of(1992,5,21),false,false);
        Person person4=new Person("Kenan",50,'M', LocalDate.of(1973,1,1),false,true);
        Person person5=new Person("Jusuf",25,'F', LocalDate.of(1998,8,8),true,true);

        person1.eat("Kebab");
        person1.drink("Kola");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

    }
}
