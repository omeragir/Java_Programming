package day31_methodOverriding.vehicleTask;

public class Car extends Vehicle{

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving  "+getbrand()+" "+getModel());
    }

/*
2. Create a subclass of Vehicle brand Car

			Extra methods:
				drive()

 */




















}
