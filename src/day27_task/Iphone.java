package day27_task;

public class Iphone {
    public String model;
    public String color;
    public char size;
    public double price;

    public static String brand;
    public static String OS;
    public static String madeIn;
    public static String design;

    public boolean isSmartPhone;

    public Iphone(String model, String color, char size, double price, boolean isSmartPhone) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isSmartPhone = isSmartPhone;
    }

    static {
        brand="Apple";
        OS="IOS";
        madeIn="China";
        design="USA";
    }

    public static void printOperatingSystem(){
        System.out.println("Operating system is "+OS);
    }
    public void call(long phoneNumber){
        System.out.println("Phone number is "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Phone number is "+phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println("FAce time address is "+phoneNumber);
    }

    public void  faceTime(String email){
        System.out.println("Iphone has face time");
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", isSmartPhone=" + isSmartPhone +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(new Iphone("Iphone 11","White",'M',500,true));

    }
}
