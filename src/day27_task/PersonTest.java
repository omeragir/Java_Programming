package day27_task;

public class PersonTest {
    public static void main(String[] args) {

        Person person1=new Person("Emily","English",22,'F');

        Person.printPlanetName();

        person1.drink("Water");

        System.out.println(person1);
    }
}
