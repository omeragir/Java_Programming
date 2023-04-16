package day30_inheritance.deviceTask;

public class Iphone extends Phone{

    public Iphone( String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("IPhone", model, color, size, price, hasBattery, hasPowerButton);
    }

}
