package day38_exceptionContinue.shapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {

     setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new InvalidShapeException("Invalid radius : "+radius);
        }
        this.radius = radius;
    }
}
