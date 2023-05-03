package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;

public class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void fly() {
        System.out.println("Plane can fly");
    }


    public void transportPeople() {
        System.out.println("Plane transport a lot of people");
    }

    public void start() {
        System.out.println("Plane has different start mode");
    }

    public void land(){
        System.out.println("");
    }

}
/*
Create an abstract subclass of Transportation named Plane that implements Flyable

				non-abstract method:
					land()

 */
