package day34_abstraction.deviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{

    public Samsung(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String turnOn() {
        return getBrand()+" "+getModel()+" has turn on mode";
    }

    @Override
    public String turnOff() {
        return getBrand()+" "+getModel()+" has turn off mode";
    }

    @Override
    public void downloadApp() {
        System.out.println("Samsung has download feature "+getBrand()+" "+getModel());
    }

}
