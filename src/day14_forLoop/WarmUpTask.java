package day14_forLoop;

public class WarmUpTask {
    public static void main(String[] args) {

        System.out.println(sumOf2IntegerNumbers(10,20));

        System.out.println(sumOf3IntegerNumber(10,20,30));

        System.out.println(sumOf4IntegerNumber(10,20,30,40));

    }

    public static int sumOf2IntegerNumbers(int n1, int n2) {
        return n1 + n2;


    }

    public static int sumOf3IntegerNumber(int n1, int n2, int n3) {
        return sumOf2IntegerNumbers(n1, n2) + n3;
        //  return n1+n2+n3;
    }

    public static int sumOf4IntegerNumber(int n1, int n2, int n3, int n4) {
        //return n1+n2+n3+n4;
        // return sumOf3IntegerNumber(n1,n2,n3)+n4;
        //return sumOf2IntegerNumbers(n1, n2) + n3 + n4;
        return sumOf2IntegerNumbers(sumOf3IntegerNumber(n1, n2, n3), n4);


    }

}
/*
  1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */