package day28_encapsulation.personTest;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Mohammed");
        Person person2 = new Person("Abdullah", 'M');
        Person person3 = new Person("Hasan", 30);
        Person person4 = new Person("Daniel", "English");
        Person person5 = new Person("Tatiana", 25, 'F');
        Person person6 = new Person("Emily", 22, 'F', "English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        person1.eat("Baklava");
        person3.drink("Tea");
        Person.printPlanetName();


    }
}
