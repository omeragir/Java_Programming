package day16_nestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition=false;
        for (;condition;){
            System.out.println("Hello Cydeo");
        }
        System.out.println("-----------------------------------");

        while (condition){
            System.out.println("Hello World");
        }
        System.out.println("-----------------------------------");

        do {
            System.out.println("Hello Cydeo-- Dog--While Loop");
        }while (condition);



    }
}
