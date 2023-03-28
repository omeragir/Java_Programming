package day22_arrayList;


public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a = 10;
        Integer a2 = 10;
        System.out.println("-----------------------------");

        int b1 = 100;
        Integer b2 = b1;

        //  Long b3= (long) b1;
        //Double b4=  b1; do not

        char ch = 'A';
        Character ch1 = ch;//Autoboxing

        double d1 = 5.5;
        Double d2 = d1;//Autoboxing

        System.out.println("--------------------");

        Integer n1 = 20;
        int n2 = n1;//Unboxing
        //   double n3=n1; do not
        //   long n4=n1;    do not

        Character e1 = 'Z';
        char e2 = e1;
        // int e3=e1; do not


    }

}
