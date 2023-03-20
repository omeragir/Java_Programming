package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";

        s1 = null;

        System.out.println(s1);
        // System.out.println(s1.toUpperCase());

        // System.out.println(s1.replace(null,"Python"));
        String a = "";
        String b = null;

        System.out.println("---------------------------");

        String str = "Python";
        str = "Cydeo";
        System.out.println(str);

        System.out.println("---------------------------");

        Dog dog1=new Dog();
        dog1.setInfo("Loki","Chow",'M',4,"White");

        Dog dog2=new Dog();
        dog2.setInfo("Chuck","Bulldog",'F',5,"Black");


        //dog1=null;
        dog1=dog2;

        System.out.println(dog1);
        System.out.println(dog2);

        

    }
}
