package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String userName = input.next();

        System.out.println("Enter your password : ");
        String passWord = input.next();

        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            for (int i = 0; i <= 2; i++) {
                if(i!=2){
                    System.err.println("Incorrect user name or password,please re-enter");
                }else{
                    System.err.println("This is your last attempt,please re-enter user name and password");
                }



                System.err.println("Invalid user name or password,please re-enter");
                System.out.println("Enter your user name : ");
                userName = input.next();

                System.out.println("Enter your password : ");
                passWord = input.next();

                if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;

                }


            }


        }

        if (!(userName.equals("Cydeo") && passWord.equals("WoodenSpoon"))) {
            System.out.println("Your account now is locked,please contact with support team");
        }
        input.close();
    }


}
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
 Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."


 */