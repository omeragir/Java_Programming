package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation {


    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public abstract void drive();

}
/*
Create an abstract subclass of Transportation named Car

				extra methods:
					drive()

 */