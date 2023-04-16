package day30_inheritance.sportTask;

public class TestSportObject {
    public static void main(String[] args) {

        Basketball basketball=new Basketball("Emily",5,2,"You have 30 seconds",4);

        System.out.println(basketball);

        basketball.win("John");


    }
}
