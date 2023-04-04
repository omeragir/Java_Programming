package day25_constructor;

public class Carpet {

    public double width;
    public double length;
    public int unit_price;
    public boolean isPersian;

    public Carpet(double width, double length, int unit_price, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unit_price = unit_price;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        int totalCost = 0;
        if (isPersian) {
            totalCost += 200 + (width * length * unit_price);
        } else if (!isPersian) {
            totalCost += (width * length * unit_price);

        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unit_price=" + unit_price +
                ", isPersian=" + isPersian +
                ", calcCost=" + calcCost() +
                '}';
    }
}
/*
 Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unit-price

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */