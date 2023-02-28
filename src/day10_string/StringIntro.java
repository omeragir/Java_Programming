package day10_string;


import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Java";
        System.out.println();
        input.close();
        System.out.println("------------------------------------");

        String sr1="Cat";
        String sr2="Dog";

        String sr3="Cat";
        String sr4="Cat";

        System.out.println(sr1==sr3);
        System.out.println(sr1==sr4);
        System.out.println(sr3==sr4);
        System.out.println(sr1==sr2);
        System.out.println("----------------------------------");

        String s1=new String("Java");
        String s2=new String("Java");

        System.out.println(s1==s2);

    }
}
