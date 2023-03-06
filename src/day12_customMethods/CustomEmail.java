package day12_customMethods;

import java.util.Scanner;

public class CustomEmail {
    public static void main(String[] args) {
        emailDomain();

    }

    public static void emailDomain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address : ");
        String email = input.nextLine();

        int at=email.indexOf('@');
        int dot=email.indexOf('.');
        String domain =email.substring(at+1,dot);
        System.out.println(domain);

    }
}
