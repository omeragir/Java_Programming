package day15_whileLoopIntro;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);

        }
        System.out.println("-----------------------------------");
        for (char i = 'A'; i <='Z' ; i++) {

            if(i=='J'){
                break;
            }
            System.out.print(i+" ");

        }
        System.out.println("");
        System.out.println("-----------------------------------");








    }


}
