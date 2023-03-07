package day13_customMethods1;

public class customCalculator {
    public static void main(String[] args) {

        calculator(50,6,'#');



    }
    public static void calculator(int num1,int num2,char character ){
       int result=0;
        if(character=='+'){
            result=num1+num2;
        } else if (character=='-') {
            result=num1-num2;
        } else if (character=='*') {
            result=num1*num2;
        } else if (character=='/') {
            result=num1/num2;
        }else {
            System.err.println("Invalid character");

        }
        System.out.println("result = " + result);

    }
}
