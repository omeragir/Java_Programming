package day29_inheritance.phoneTask;

public class Phone {

    private String brand;
    private String model;
    private char size;
    private double price;
    private String color;

    public void setInfo(String brand, String model, char size, double price, String color) {
       setBrand(brand);
       setModel(model);
       setSize(size);
       setPrice(price);
       setColor(color);
    }

    public String getBrand() {
        if (brand==null){
            brand="Unknown";
        }
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()||brand.isBlank()){
            System.err.println("Invalid brad ");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        if (model==null){
            model="Unknown";
        }
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank()||model.isBlank()){
            System.err.println("Invalid model ");
            System.exit(1);
        }
        this.model = model;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println("Price can not be negative "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        if (color==null){
            color="Unknown";
        }
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank()||color.isEmpty()){
            System.err.println("Invalid color");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println("Please call the phone number "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Please look at the text "+phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
