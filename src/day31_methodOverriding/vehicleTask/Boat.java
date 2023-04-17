package day31_methodOverriding.vehicleTask;

public class Boat extends Vehicle{

    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public  void sail(){
        System.out.println("Sailing  "+getbrand()+" "+getModel());
    }

}
/*
	4. Create a subclass of Vehicle brand Boat

			Extra methods:
				sail()
 */