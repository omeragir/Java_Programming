package day34_abstraction.deviceTask;

public class Laptop extends Computer{

    public Laptop(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String turnOn() {
        return "Laptop has turn on mode";
    }

    @Override
    public String turnOff() {
        return "Laptop has turn on mode";
    }
}
