package day06_ifStatements;

public class Cigarettes {
    public static void main(String[] args) {
        int age1=25;
        int age2=100;
        boolean isEligible=age1>=21;

        if(!isEligible){
            System.out.println("You are not eligible to buy Cigarettes ");
        }else{
            System.out.println("You are eligible to buy Cigarettes ");
        }
    }
}
