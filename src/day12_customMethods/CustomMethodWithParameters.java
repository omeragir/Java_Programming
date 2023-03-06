package day12_customMethods;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        oddOrEven(25);
        System.out.println("--------------------------------");
        oddOrEven(10_000);

    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

}
