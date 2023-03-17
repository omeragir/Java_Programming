package day15_whileLoopIntro;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Dog you want to reserve a room? Yes/No");
        String room = input.next().toLowerCase();

        while (!(room.equals("no") || room.equals("yes"))) {
            System.err.println("Invalid entry! Please re-enter.");
            room = input.next();

            if (room.equals("no")) {
                System.out.println("Have nice day");
                return;
            }

        }

        input.nextLine();

        System.out.println("Which type of room the do you want to reserve?");
        String typeOfRoom = input.nextLine().toLowerCase().trim();


        while (!(typeOfRoom.equals("king bed") || typeOfRoom.equals("queen bed") || typeOfRoom.equals("single bed"))) {
            System.err.println("Invalid Entry! Please re-enter.");
            typeOfRoom = input.nextLine().toLowerCase();
        }

        String res = typeOfRoom + " ==> ";
        res += (typeOfRoom.equals("king bed")) ? "120$" : (typeOfRoom.equals("queen bed")) ? "100$" : "80$";

        System.out.println(res);


    }
}
/*
Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */