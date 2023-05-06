package day36_polymorphismContinue;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog = new Dog();

        //Cat cat=new Dog();
        Animal animal = (Animal) new Dog();    //Implicit Casting

        System.out.println("---------------------------");
        Animal animal1 = new Dog();
        animal1.setInfo("Max", "Husky", 'M', 3, "Small", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ((Dog) animal1).bark();//down casting

        // Dog dog1=(Dog)animal1;//down casting
        // dog1.bark();

        //  ( (Cat)animal1 ).scratch();   //  Dog can not be converted to Cat,because there is not  a relationship between dog and cat
        System.out.println(" ----------------------------------");

        Phone phone = new Nokia("XR20", "Small", 300, "Black");

        phone.call(123456);
        phone.text(123456);
        ((Nokia) phone).selfDefense();

        //( (IPhone)phone ).faceTime(123456);//Nokia can not be converted to Iphone,because there is not  relationship between Nokia and IPhone

        ((Nokia) phone).selfDefense();
        System.out.println(" ----------------------------------");

        Employee employee = new Developers("Daniel", 25, 'M', "D25", "Java Developers", 95000, "Java");
        employee.work();

        System.out.println(((Developers) employee).getProgrammingLanguage());

        // Tester tester=(Tester)employee;

        System.out.println("-------------------------");

        Electric electric = (Electric) new Tesla("Tesla", "Model Y", "Black", 2020, 55000);
        electric.charge();
        ((Tesla) electric).selfDrive();
        ((AutoPilot) electric).selfDrive();
        System.out.println("-------------------------");


        Employee employee1 = new Teacher("James", 45, 'M', "J45", "Math Teacher", 75000);

        Employee employee2 = new Developers("Daniel", 25, 'M', "D25", "Java Developers", 95000, "Java");


        Employee employee3 = new Driver("Aaron", 22, 'M', "A22", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 21, 'F', "E21", "SDETs", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();



    }
}
