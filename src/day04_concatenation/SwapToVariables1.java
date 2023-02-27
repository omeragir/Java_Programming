package day04_concatenation;

public class SwapToVariables1 {
    public static void main(String[] args) {
        int x=25;
        int y=0;
        int z=y-x;
        System.out.println("x: "+(x+z));
        System.out.println("y: "+(y-z));

        System.out.println("-----------------------------");
        int a=1;
        int b=30;
        int c=a;
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
