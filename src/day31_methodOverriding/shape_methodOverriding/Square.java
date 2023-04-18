package day31_methodOverriding.shape_methodOverriding;

public class Square extends Shape{

    private double side;

    public Square( double side) {

       setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double area() {
        return side*side;
    }


    public double perimeter() {
        return side*4;
    }


    public void draw() {
        System.out.println("Drawing square");
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }

        System.out.println("\t* * * * * *");
    }
}
