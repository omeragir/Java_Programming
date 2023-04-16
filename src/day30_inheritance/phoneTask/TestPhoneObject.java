package day30_inheritance.phoneTask;

public class TestPhoneObject {
    public static void main(String[] args) {

        IPhone iPhone=new IPhone("Iphone 12","Large",1000.5,"Black");

        Samsung samsung=new Samsung("Galaxy S22","Medium",1100,"White");

        Nokia nokia=new Nokia("Brick","Small",50,"Pink");


        iPhone.call(911);
        samsung.call(911);
        nokia.call(911);

        iPhone.text(123456);
        samsung.text(123456);
        nokia.text(123456);

        iPhone.faceTime(12345);
        samsung.freeze();
        nokia.selfDefense();

    }
}
