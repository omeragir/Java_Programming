package day18_garbageCollection;

public class TestPizzaObject {
    public static void main(String[] args) {

        PizzaMethods pizza1 = new PizzaMethods();

        // pizza1.size='L';

        pizza1.setInfo('L', 2, 3);

        PizzaMethods pizza2 = new PizzaMethods();

        pizza2.setInfo('M', 5, 2);
        // pizza2.size='M';

        System.out.println(pizza2);
        System.out.println(pizza1.toString());
        System.out.println("----------------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            PizzaMethods small = new PizzaMethods();
            small.setInfo('S', 2, 2);
            total += small.calcCost();

            PizzaMethods large = new PizzaMethods();
            large.setInfo('L', 3, 4);
            total += large.calcCost();

            PizzaMethods medium = new PizzaMethods();
            medium.setInfo('M', 4, 5);
            total += medium.calcCost();


        }
        System.out.println("total = "+total);

    }
}
