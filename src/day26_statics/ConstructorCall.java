package day26_statics;

public class ConstructorCall {


    public ConstructorCall() {
        System.out.println("Default constructor ");
    }

    public ConstructorCall(int a) {

        this() ;
        System.out.println("Constructor with int argument");
    }

    public  ConstructorCall(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCall(String c){
        this();

        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        method1();

        System.out.println("-------------------------");

        method2();
    }

    public static void method1() {



        System.out.println("Method 1");

    }

    public static void method2() {

        method1();
        method2();

        System.out.println("Method 2");
    }

}
