package day34_abstraction.deviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String turnOn() {
        return "Desktop has turn on mode";
    }

    @Override
    public String turnOff() {
        return "Desktop has turn off mode";
    }
}
