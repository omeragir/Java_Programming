package day17_customClass;

public class Rectangle {

    public double length;
    public  double width;


    public double calculateArea(double length, double width){
        double area=length*width;
        return area;
    }
    public double calculatePerimeter(double length, double width){
        double perimeter =2*(length+width);
        return perimeter;
    }

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" +  calculateArea(length,width)+
                ", width=" + calculatePerimeter(length,width) +
                '}';
    }




}
/*
create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object
 */