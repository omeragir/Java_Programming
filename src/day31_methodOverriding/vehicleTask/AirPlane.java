package day31_methodOverriding.vehicleTask;

public class AirPlane extends Vehicle{

    public AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println("Flying  "+getbrand()+" "+getModel());
    }

}
/*
5. Create a subclass of Vehicle brand AirPlane

			Extra methods:
				fly()

 */