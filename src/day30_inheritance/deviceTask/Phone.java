package day30_inheritance.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(){
        System.out.println(getModel()+" is calling");
    }
    public void text(){
        System.out.println(getModel()+" is texting");
    }

}
