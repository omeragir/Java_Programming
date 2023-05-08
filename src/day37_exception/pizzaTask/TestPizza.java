package day37_exception.pizzaTask;

import day18_garbageCollection.TestPizzaObject;
import day36_polymorphismContinue.Circle;

public class TestPizza {
    public static void main(String[] args) {

        Pizza pizza = new Pizza('S', 2, 3);
        Pizza pizza1 = new Pizza('S', 2, 3);
        System.out.println(pizza1 == pizza);  //false

        System.out.println(pizza.equals(pizza1));//true

        //System.out.println(pizza.equals("Pizza"));//Invalid object

        Object obj = new Pizza('S', 2, 3);//Upcasting

        boolean r = obj.equals(pizza1);
        System.out.println(r);

        double total = ((Pizza) obj).calcCost();

        System.out.println(total);

        //   double area= ((Circle)obj).area();
        //  System.out.println(area);

        System.out.println("Test Completed");

    }
}
