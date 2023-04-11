package day27_task;

public class IphoneTest {

    public static void main(String[] args) {

        Iphone iphone1=new Iphone("Iphone 11","Black",'L',800,true);

        System.out.println(iphone1);

        iphone1.toString();

        iphone1.call(2514);
        iphone1.printOperatingSystem();



    }

}
