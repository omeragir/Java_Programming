package day13_customMethods1;

public class ReturnExample {
    public static void main(String[] args) {



    }
    public static boolean isOdd(int number){
        if(number%2!=0){
            return true;
        }else
            return false;
    }

    public static boolean isEven(int num){
        if(!isOdd(num)){
            return true;
        }else
            return false;
    }

    public static int max(int n1,int n2){
        if(n1>n2){
            return n1;
        }else
            return n2;
    }





}
