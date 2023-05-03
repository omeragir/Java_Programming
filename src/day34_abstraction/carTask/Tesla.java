package day34_abstraction.carTask;

import day35_polymorphism.transportationTask.Electric;

import java.sql.SQLOutput;

public class Tesla extends Car implements Electric {


    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
   public void start() {
        System.out.println("Use voice control to start  "+getMake()+" "+getModel());
    }
    public void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" has auto pilot feature");
    }

    @Override
    public void charge() {
        System.out.println("Possible");
    }
}
