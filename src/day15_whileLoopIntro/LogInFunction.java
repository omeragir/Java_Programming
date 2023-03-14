package day15_whileLoopIntro;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String user = input.next();

        System.out.println("Enter your user name: ");
        String pass = input.next();

        if (user.equals("Cydeo") && pass.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else if (!(user.equals("Cydeo") && pass.equals("Cydeo123"))) {
            for (int i = 0; i <= 2; i++) {
                System.err.println("Invalid user name or password! Please re-enter user name ");
                user = input.next();
                System.err.println("Invalid user name or password! Please re-enter password ");
                pass = input.next();

            }
            System.err.println("Your account is locked!");

        }

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and
                 if all three attempts are failed, then print "Your account is lucked."
 */