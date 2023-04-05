package day26_statics;

public class IPhone {

    public static String brand="Apple";// static: "Apple" is the brand of all the iphone object

    public String model;// instance:different models for iphone object

    public String color;

    public double price;

    public static String OS="IOS";//static: operating system is same for all the iphone objects

    public static String madeIn="Chine";

    public static boolean hasBattery=true;

    public static boolean isTouchScreen=true;

    public static boolean isExpensiveToFix=true;

/*
   public static void printPhoneInfo(){//static only accepts statics
       System.out.println("Model : "+model);
       System.out.println("Color : "+color);
   }

 */

    public void printPhoneInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);

    }

    public static void printOperatingSystem(){
        System.out.println("Operating system : "+OS);
    }



}







/*
brand , model,color price OS,madeIn
 */