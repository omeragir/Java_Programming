package day11_string_continue;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {


        String correctUserName = "Cydeo";
        String correctPassWord = "Cydeo";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name : ");
        String username = input.nextLine();

        System.out.println("Enter your password : ");
        String password = input.nextLine();
        input.close();

        if (username.equals(correctUserName) && password.equals(correctPassWord)) {
            System.out.println("You are now logged in");

        } else {
            System.err.println("Incorrect username or password. Please try again");
        }


    }
}
/*
Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */