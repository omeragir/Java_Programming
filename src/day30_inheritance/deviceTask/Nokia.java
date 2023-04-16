package day30_inheritance.deviceTask;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void selfDefense(){
        System.out.println(getModel()+" has self defense");
    }

}
