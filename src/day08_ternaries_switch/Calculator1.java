package day08_ternaries_switch;

public class Calculator1 {
    public static void main(String[] args) {
        char ch = '@';
        int a = 5;
        int b = 8;
        int total = 0;
        switch (ch) {
            case '+':
                total = a + b;
                break;
            case '-':
                total = a - b;

                break;
            case '*':
                total = a * b;
                break;
            case '/':
                total = a / b;
                break;
            default:
                System.out.println("Invalid");
                break;

        }
        System.out.println("total = " + total);


    }
}
