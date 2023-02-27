package day04_concatenation;

public class SwapToVariable21 {
    public static void main(String[] args) {
        int x=10;
        int y=15;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping :\n X="+x+"\n y="+y);
    }
}
