package day06_ifStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
    int number=45;

    boolean isEven=number%2==0;

    if(!isEven){
        System.out.println(number+" is odd number");
    }if(isEven){
            System.out.println(number+" is even number");

    }


    }
}
