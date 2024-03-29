package day38_exceptionContinue;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
            if (age < 0)
                throw new InputMismatchException("Age of the person should not be negative " + age);
        } else {
            throw new InputMismatchException("Age of the person can not be greater than 150 :" + age);
        }
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        System.out.println("-------------------------");
        //throw new RuntimeException("Runtime execution");
        //System.out.println("Hello");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------");

        RuntimeException exception = new RuntimeException();
        //  throw exception;
        // throw new RuntimeException();


        //throw new Person("Jimmy",32,'M');


    }


}
