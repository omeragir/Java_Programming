package day13_customMethods1;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        System.out.println(  isEven(10) );

        int num=200;
        if(isEven(num)){
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");

        }
        System.out.println("----------------------------------------------------");



    }
public static boolean isOdd(int num){
        if(num%2!=0){
            return true;
        }else {
            return false;
        }
}

public static boolean isEven(int num){
        return !isOdd((num));
}

}
