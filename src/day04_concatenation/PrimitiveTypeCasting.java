package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        byte a = 15;
        short b = a;
        System.out.println(b);
        System.out.println("----------------------------------");

        int c = a;

        long d = 3000l;

        float f = d;
        //-------------------------------------------
        int x = 100;
        //   byte y=x; error

        byte y = (byte) x;
        float v = 28.2f;
        short g = (short) v;
        System.out.println(g);






    }
}
