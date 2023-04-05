package day26_statics;

public class TestIPhoneObject {
    public static void main(String[] args) {

        IPhone iPhone1=new IPhone("Iphone 12","Black",1000);
        System.out.println(iPhone1.price);
        System.out.println(iPhone1.model);
        System.out.println(iPhone1.color);

        iPhone1.printPhoneInfo();
/*
        System.out.println(iPhone1.brand);  don`t use this method
        System.out.println(iPhone1.OS);
        iPhone1.printOperatingSystem();

 */

        System.out.println(IPhone.brand);// use this method , class name use
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();

    }
}
