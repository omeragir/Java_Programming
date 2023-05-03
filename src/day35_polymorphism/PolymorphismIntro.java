package day35_polymorphism;

import day31_methodOverriding.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;


public class PolymorphismIntro {

    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Mia", "CatMia", 'F', 3, "Small", "White-Black");

        Lion lion = new Lion("Lion Max", "Lio", 'M', 5, "Large", "Yellow");
        Eagle eagle = new Eagle("Mers", "Eag", 'F', 4, "Medium", "Black");
        Tiger tiger = new Tiger("Shir", "Tig", 'F', 3, "Small", "White");

        Parrot parrot = new Parrot("Maxim", "Par", 'M', 1, "Small", "Red");
        Dolphin dolphin = new Dolphin("Dolphin", "Dol", 'M', 2, "Small", "White");

        Duck duck = new Duck("Duck", "Hus", 'F', 4, "Small", "White");


        Animal[] animals = {dog, cat, lion, tiger, eagle, dolphin, parrot, duck};

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        animal.eat();
        animal.drink();
        animal.sleep();

        //animal.play();

        System.out.println("-----------------------");

        String str = "Java";
        Integer n = 100;
        Boolean r = false;
        Double d = 10.5;

        Circle circle = new Circle(4);


        Teacher teacher = new Teacher("James", 45, 'M', "J45", "Math Teacher", 75000);

        Developers developers = new Developers("Daniel", 25, 'M', "D25", "Java Developers", 95000, "Java");

        Driver driver = new Driver("Aaron", 22, 'M', "A22", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 21, 'F', "E21", "SDETs", 80000);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);


        Object[] objects = {str, n, r, d, circle, honda, tesla, animal};

        System.out.println(Arrays.toString(objects));

        Employee[] employees = {teacher, tester, developers};

        Employee obj = new Developers("Daniel", 25, 'M', "D25", "Java Developers", 95000, "Java");
        obj.work();

        Employee obj1=new Teacher("James", 45, 'M', "J45", "Math Teacher", 75000);
        obj1.work();

        Employee obj2=new Driver("Aaron", 22, 'M', "A22", "Truck Driver", 90000);
        obj2.work();
        System.out.println("-------------------------");




    }
}
