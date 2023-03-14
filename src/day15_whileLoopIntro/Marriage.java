package day15_whileLoopIntro;

import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Will you marry me?");
        String yesOrNo=input.next().toLowerCase();

        while (!(yesOrNo.equals("yes")||yesOrNo.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
            yesOrNo=input.next();
        }

        if(yesOrNo.equals("yes")){
            System.out.println("Congrats.");
        } else if (yesOrNo.equals("no")) {
            System.out.println("Goodbye");
        }

    }
}
