package day36_polymorphismContinue;

import day30_inheritance.phoneTask.IPhone;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1=new Circle(5);

        Circle circle2=new Circle(5);

        Circle circle3=new Circle(15);

        System.out.println(circle1==circle2);//false

      //  System.out.println(circle1.equals("Java"));//different

        System.out.println(circle1.equals(circle2));//true
        System.out.println(circle1.equals(circle3));//false

        System.out.println("-------------------------------");

        IPhone iPhone1=new IPhone("IPhone12","Medium",900,"Black");
        IPhone iPhone2=new IPhone("IPhone12","Medium",900,"Black");

        System.out.println(iPhone1.equals(iPhone2));


    }
}
