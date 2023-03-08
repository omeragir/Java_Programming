package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            sum = sum + i;

        }
        System.out.println(sum);
        System.out.println("--------------------------------------------");


        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.print(j + " ");

        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------");
    }
}
