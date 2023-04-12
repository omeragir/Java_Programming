package day28_encapsulation.task;

public class TestSquare {
    public static void main(String[] args) {
        Square square1=new Square(5);
        System.out.println(square1);
        square1.setSide(6);
        System.out.println(square1);
    }
}
