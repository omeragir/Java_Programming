package day22_arrayList;

public class WrapperClassesMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);

        // Integer.parseInt(str); //Unboxing
        int num1 = Integer.parseInt(str);
        System.out.println(num1 + 1);

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("---------------------------------");
        String s = "20.5";
        double s2 = Double.parseDouble(s);
        Double s1 = Double.valueOf(s);
        System.out.println(s1);

        System.out.println("---------------------------------");

        String x = "true";
        boolean x1 = Boolean.parseBoolean(x);
        Boolean x2=Boolean.valueOf(x);

        System.out.println(x1);
        System.out.println(x2);


    }
}
