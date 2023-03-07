package day13_customMethods1;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(25);
        System.out.println("--------------------------------------------");


        System.out.println("Test started");
        boolean exit = true;
        if(exit){
            return;


        }

        System.out.println("Test1 completed");
        System.out.println("Test2 started");
    }

    public static void eligible(int age) {
        if ((age <= 0 || age > 150)) {
            System.err.println("Invalid age");
            return;
        }
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.err.println("You are not eligible to buy alcohol");
        }

    }

    public static int multiplication(int n1, int n2) {
        int result = n1 * n2;
        return result;


    }


}
