package day37_exception;

import day37_exception.pizzaTask.Pizza;

import java.io.FileInputStream;

public class ExceptionIntro {

    public static void main(String[] args) {

        String str = "Java";
        // char ch = str.charAt(250);//unchecked exception
        //System.out.println(ch);

        Pizza pizza = null;
        //pizza.calcCost();//unchecked exception

        //System.out.println(50/0);//unchecked exception

        System.out.println("Hello world");
        System.out.println("----------------");

        int score = 100;
        if (score > 59) {
            System.out.println("Your grade is D");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        }
        System.out.println("----------------");

       // FileInputStream file=new FileInputStream("");//checked exception

       // Thread.sleep(300);//checked exception



    }


}
