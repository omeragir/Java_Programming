package day38_exceptionContinue;

import utilities.Library;

public class ThrowsKeyword2 {
    public static void main(String[] args)  {

      //  method1();
        Library.sleep(3.5);
    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello");
        pauseFor5Seconds();
        System.out.println("World");
    }

}
