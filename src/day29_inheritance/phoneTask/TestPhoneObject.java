package day29_inheritance.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        apple1.setInfo("Iphone 11", "Pro Max", 'L', 850, "Gold");

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung", "Galaxy 10", 'M', 750, "Black");

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia", "Rise", 'S', 550, "White");

        System.out.println(apple1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        nokia1.selfDefense();

    }
}
