package day28_encapsulation.task;

public class Rectangle {

    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0||width==0){
            System.err.println("Width of the rectangle should not be negative");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0||length==0){
            System.err.println("Length of the rectangle should not be negative");
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle(double width, double length) {
       setWidth(width);
       setLength(length);
    }

    public double area(){
        return width*length;
    }
    public double perimeters(){
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ", perimeters=" + perimeters() +
                ", area=" + area() +
                '}';
    }
}
/*
Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */
