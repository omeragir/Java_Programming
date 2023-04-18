package day31_methodOverriding.shape_methodOverriding;

public class TestShapeObject {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();
        System.out.println("----------------------------");

        Circle circle=new Circle(3.5);
        System.out.println(circle);
        System.out.println("----------------------------");

        Rectangle rectangle=new Rectangle(3,6);

        System.out.println(rectangle);
        rectangle.draw();

        System.out.println("----------------------------");

    }
}
