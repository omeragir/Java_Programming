package day36_polymorphismContinue;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;

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

        Phone phone=  new Nokia("XR20", "Small", 300, "Black");

        phone.call(123456);
        phone.text(123456);
        ( (Nokia)phone ).selfDefense();

        ( (IPhone)phone ).faceTime(123456);//Nokia can not be converted to Iphone,because there is not  relationship between Nokia and IPhone

        ((Nokia) phone).selfDefense();
        System.out.println(" ----------------------------------");


    }
}
