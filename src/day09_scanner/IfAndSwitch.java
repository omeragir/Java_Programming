package day09_scanner;

import java.sql.SQLOutput;

public class IfAndSwitch {
    public static void main(String[] args) {
        int num=50;
        if(num==50||num==75||num==100){
            switch (num ){
                case 50:
                    System.out.println("20 crew,30 passengers");
                case 75:
                    System.out.println("25 crew,50 passengers");
                default:
                    System.out.println("30 crew,70 passengers");

            }

        }else{
            System.out.println("Invalid Number");
        }
    }
}
