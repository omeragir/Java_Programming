package day06_ifStatements;

public class IdentIfNumber {
    public static void main(String[] args) {
        int number=0;
        boolean postiveNumber=number>0;
        boolean negativNumber=number<0;
        // boolean zeroNumber=number==0 ;

        boolean zeroNumber=!postiveNumber&& !negativNumber;
        if(postiveNumber)  {
            System.out.println(number+" is positiv number: "+postiveNumber );
            System.out.println(number+" is negativ number: "+negativNumber);
            System.out.println(number+" is zero number: "+zeroNumber);
        }

        else{
            System.out.println(number+" is negativ number: "+negativNumber);
        }if (zeroNumber){
            System.out.println(number+" is zero number: "+zeroNumber);
        }


    }
}
