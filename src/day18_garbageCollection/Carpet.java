package day18_garbageCollection;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;


    public void setInfo(double width, double length, double unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersion;
    }

    public double calcCost(){
        double totalPriceOfCarpet=(width*length)*unitPrice;
        if(isPersian){
            totalPriceOfCarpet+=200;
        }
       return totalPriceOfCarpet;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unit Price=" + unitPrice +
                ", is Persian=" + isPersian +
                ", total price of carpet= $" + calcCost() +
                '}';
    }





}
