package day34_abstraction.deviceTask;

public abstract class Device {

    private final String brand,model;
    private double price;
    private String color;
    private final char size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        if (brand==null||brand.isEmpty()||brand.isBlank()){
            System.err.println("Brand can not be null,empty or blank ");
            System.exit(1);
        }
        this.brand = brand;
        if (model==null||model.isBlank()||model.isEmpty()){
            System.err.println("Model can not be null,empty or blank ");
            System.exit(1);
        }
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price can not be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null||color.isEmpty()||color.isBlank()){
            System.err.println("Color can not be null,empty or blank ");
            System.exit(1);
        }
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    public abstract String turnOn();
    public abstract String turnOff();

    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */
