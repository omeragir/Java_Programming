package day35_polymorphism;

import day31_methodOverriding.shape_methodOverriding.Shape;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Car;
import day34_abstraction.carTask.Tesla;
import day34_abstraction.deviceTask.Device;
import day35_polymorphism.transportationTask.AutoPark;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.CydeoCar;
import day35_polymorphism.transportationTask.Electric;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black&White");
        //animal.fly();

        animal.eat();
        animal.drink();
        animal.sleep();

        Flyable obj = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black&White");
        obj.fly();
        //obj.eat();
        System.out.println(obj.canFly);

        Lion lion=null;
        Parrot parrot=null;
        Shark shark=null;
        Dolphin dolphin=null;
        Eagle eagle=null;

        Dog dog=null;
        Cat cat=null;

        CydeoCar cydeoCar=null;

        Flyable[] birds ={parrot,eagle};
        Playable[]friendly={dog,cat,dolphin};

        boolean isAnimal=dog instanceof Animal;
        System.out.println(isAnimal);
        System.out.println("--------------------");

        Car car=new Tesla("Model Y","White",2021,60000);
        boolean isTesla=car instanceof Tesla;
        boolean isAudi=car instanceof Audi;
        boolean isElectricCar=car instanceof Electric;
        boolean hasAutoPilot=car instanceof AutoPilot;

        System.out.println(isTesla);
        System.out.println(isAudi);
        System.out.println(isElectricCar);
        System.out.println(hasAutoPilot);



    }


}
