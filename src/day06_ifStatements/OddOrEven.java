package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number=23;
        boolean isEven=number%2==0;
        boolean isOdd=!isEven;
        if(isEven) {


            System.out.println(number+" is an even number: " + isEven);
        }else {
            System.out.println(number+" is an odd number:  "+ isOdd);

        }


    }



}
