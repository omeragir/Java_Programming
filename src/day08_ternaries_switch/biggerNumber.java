package day08_ternaries_switch;

public class biggerNumber {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int c=3;

        String biggerNumber=(a>b&&a>c)?"a is bigger number":(b>a&&b>c)?"b is bigger number":"c is bigger number";
        System.out.println("biggerNumber = " + biggerNumber);
    }
}
