package day38_exceptionContinue;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Thread.sleep(3500);
        Library.sleep(3.5);
        System.out.println("How are you?");
        System.out.println("-------------------------");

        if (LocalTime.now().equals(LocalTime.of(4, 0))) {
            throw new BreakTimeException();
        }
       // throw new RuntimeException("Something went wrong");
       throw new BreakTimeException("It`s time to go home");

       // throw new BreakTimeException();


    }
}
