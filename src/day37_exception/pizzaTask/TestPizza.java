package day37_exception.pizzaTask;

import day18_garbageCollection.TestPizzaObject;

public class TestPizza {
    public static void main(String[] args) {

        Pizza pizza=new Pizza('S',2,3);
        Pizza pizza1=new Pizza('S',2,3);
        System.out.println(pizza1==pizza);  //false

        System.out.println(pizza.equals(pizza1));//true

        System.out.println(pizza.equals("Pizza"));//Invalid object


    }
}
