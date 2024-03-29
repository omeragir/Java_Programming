package day36_polymorphismContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class IPhone {

    private String brand, model, size, color;
    private double price;

    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Price can not be negative or zero " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
/*
        String[] colors={"Black", "White", "Silver", "Gold", "Pink"};
        if (Arrays.asList(colors).contains(colors)){
            this.color=color;
        }else {
            System.err.println("Invalid color : "+color+"\n color of the can only be :"+Arrays.toString(colors);
            System.exit(1);
        }

 */

        ArrayList<String> phoneColor = new ArrayList<>();
        phoneColor.addAll(Arrays.asList("Black", "White", "Silver", "Gold", "Pink"));

        if (!phoneColor.contains(color)) {
            System.err.println("Invalid color " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " is calling :" + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " is texting :" + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof IPhone)){
            System.err.println("Invalid object,Object must be IPhone");
            System.exit(1);
        }


            if (model.equals(((IPhone) obj).model)) {//if the model of the IPhone equals to the given IPhone` model
                if (color.equals(((IPhone) obj).color)) {//if the color of the IPhone equals to the given IPhone` color
                    return true;
                }
            }


        return false;

    }
}
