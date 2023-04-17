package day31_methodOverriding.vehicleTask;

public class Vehicle {

    private String brand, model, color;
    private int year;
    private double price;

    public Vehicle(String brand, String model, String color, int year, double price) {
        setbrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class brandd Vehicle
			Variables:
				brand, model, year, color, price

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				toString()




	4. Create a sub class of Vehicle brandd Boat

			Extra methods:
				sail()

	5. Create a sub class of Vehicle brandd AirPlane

			Extra methods:
				fly()

 */