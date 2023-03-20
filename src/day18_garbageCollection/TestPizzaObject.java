package day18_garbageCollection;

public class TestPizzaObject {
    public static void main(String[] args) {

        PizzaMethods pizza1=new PizzaMethods();

       // pizza1.size='L';

        pizza1.setInfo('L',2,3);

        System.out.println(pizza1.toString());

        PizzaMethods pizza2=new PizzaMethods();

        // pizza2.size='M';

    }
}
