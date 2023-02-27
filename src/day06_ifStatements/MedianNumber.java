package day06_ifStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 15;
        int b = 50;
        int c = 10;
        boolean aIsMedian = a > b && a < c || a > c && a < b;
        boolean bIsMedianNumber = b > c && b < a || b > a && b < c;
        boolean cIsMedian = !aIsMedian && !bIsMedianNumber;
        String data = "";
        if (aIsMedian) {
            data = a + " is median";
        }
        if (bIsMedianNumber) {
            data = b + " is median";

        }
        if (cIsMedian) {
            data = c + " is median";
        }
        System.out.println(data);
    }

}
