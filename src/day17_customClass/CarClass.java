package day17_customClass;

public class CarClass {

    public String make;
    public int year;
    public String color;
    public double price;

    public void setInfo (String make, int year, String color, double price) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "CarClass{" +
                "make='" + make + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}
