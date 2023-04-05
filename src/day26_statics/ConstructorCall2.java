package day26_statics;

public class ConstructorCall2 {

    public ConstructorCall2() {
        System.out.println("Default");
    }


    public ConstructorCall2(int a) {
        this();
        System.out.println("int argument");
    }

    public ConstructorCall2(String a) {
        this(5);
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        ConstructorCall2 obj=new ConstructorCall2();
        System.out.println("-----------------------------");

        ConstructorCall2 obj1=new ConstructorCall2(5);
        System.out.println("---------------------------------");

        ConstructorCall2 obj2=new ConstructorCall2("a");

    }

}
