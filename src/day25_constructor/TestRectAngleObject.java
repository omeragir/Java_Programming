package day25_constructor;

public class TestRectAngleObject {

    public static void main(String[] args) {
        /*
        Rectangle rectangle1=new Rectangle();

        rectangle1.setInfo(5,6);

        System.out.println(  rectangle1);

        System.out.println(rectangle1.area());
        System.out.println("----------------");

        Rectangle rectangle2=new Rectangle();

        rectangle2.setInfo(10,20);
        System.out.println(rectangle2);
        System.out.println("----------------");

        Rectangle rectangle3=new Rectangle();

        rectangle3.setInfo(15,25);
        System.out.println(rectangle3);
        System.out.println("----------------");

        Rectangle rectangle4=new Rectangle();

        rectangle4.setInfo(12,13);
        System.out.println(rectangle4);
        System.out.println("----------------");

         */

        Rectangle rectangle1=new Rectangle(10,20);

        Rectangle rectangle2=new Rectangle(5,10);

        Rectangle rectangle3=new Rectangle(6,12);

        Rectangle rectangle4=new Rectangle(13,13);



        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);

    }
}
