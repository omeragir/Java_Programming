package day06_ifStatements;

public class Calculator {
    public static void main(String[] args) {
        double num1=10;
        double num2=20;
        char operator='+';
       double result=0;


        if(operator=='+'){
           result=num1+num2;

        }if(operator=='-'){
            result=num1-num2;

        }if(operator=='*'){
            result=num1*num2;

        }if(operator=='/'){
            result=num1/num2;

        }

        System.out.println(result);

    }
}
