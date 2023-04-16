package day30_inheritance.deviceTask;

public class PersonalComputer extends Computer{

    public PersonalComputer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void study(String name){
        System.out.println(name+" is studying "+getModel());
    }

}
