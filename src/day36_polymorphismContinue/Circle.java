package day36_polymorphismContinue;

public class Circle {

    private double radius;
    private final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * PI;
    }

    public double perimeters() {
        return 2 * radius * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeters=" + perimeters() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Circle)) {//if the specified object is not circle,then we should not compare them
            System.out.println("Invalid Object");
            System.exit(1);
        }
        if (this.radius == ((Circle) obj).radius) {//if the current circle` radius is equal to the given circle`s radius   then two circles equals
            return true;
        }
        return false;
    }

    //.equals()


}
