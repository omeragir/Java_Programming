package day30_inheritance.deviceTask;

public class SmartTv extends TV{

    public SmartTv(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void connect(String name){
        System.out.println(name+" is connecting Internet");
    }


}
