package day26_statics;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter =2*radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }
    public static void printPi(){
        System.out.println("Pi : "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                "area= " + area() +
                "perimeter= " + perimeter() +
                "pi= " + pi +
                '}';
    }
}
/*
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi,
					area and perimeter of the circle when the object of circle is passed in the print statement

 */