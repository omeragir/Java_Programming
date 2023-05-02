package day34_abstraction.deviceTask;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String turnOn() {
        return "Personal computer has turn on mode";
    }

    @Override
    public String turnOff() {
        return "Personal computer has turn off mode";
    }
}
