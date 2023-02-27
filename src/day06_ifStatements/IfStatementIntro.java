package day06_ifStatements;

public class IfStatementIntro {
    public static void main(String[] args) {
        int number=10;
        boolean isPositive=number>0;
        boolean isNegative=number<0 ;
        boolean isZero=number==0 ;


        if(isPositive){
            System.out.println(number+" is positive");
        }if(isNegative){

            System.out.println(number+" is negative");
        }else if(isZero){

            System.out.println(number+" is zero");
        }

    }
}
