package day25_constructor;

public class PizzaTestObject {
    public static void main(String[] args) {

        Pizza pizza=new Pizza('L',2,5);
        Pizza pizza1=new Pizza('S',3,1);
        Pizza pizza2=new Pizza('M',2,2);

        System.out.println(pizza);
        System.out.println(pizza1);
        System.out.println(pizza2);

    }
}
