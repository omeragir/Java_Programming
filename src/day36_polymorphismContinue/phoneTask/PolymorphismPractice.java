package day36_polymorphismContinue.phoneTask;

import day30_inheritance.phoneTask.*;

public class PolymorphismPractice {


    public static void main(String[] args) {

        //Phone phone1= new Samsung("Galaxy S19", "Medium", 400,"Black");

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", 900, "Black"),
                new IPhone("Iphone 12 Pro Max", "Large", 700, "White"),
                new IPhone("Iphone 9", "Medium", 800, "Gold"),
                new Samsung("Galaxy S19", "Medium", 400, "Black"),
                new Samsung("Galaxy S20", "Large", 900, "White"),
                new Samsung("Galaxy S21", "Large", 800, "Black"),
                new Nokia("XR20", "Small", 300, "Black"),
                new Nokia("G10", "Medium", 30, "White"),
                new Nokia("G50", "Large", 300, "Black"),
                new IPhone("Iphone 12 Pro", "Large", 900, "Pink"),
                new IPhone("Iphone 11 Pro Max", "Large", 100, "Silver"),
                new Samsung("Galaxy S18", "Medium", 900, "Gold"),
                new Samsung("Galaxy S17", "Large", 600, "Black"),
                new Nokia("G10", "Medium", 40, "Silver"),
                new IPhone("Iphone 6", "Smalle", 700, "Black"),
                new IPhone("Iphone 7", "Smalle", 900, "Pink")
        };

        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());

        }
        System.out.println("-----------------------------------");

        int countIphone = 0,
                countSamsung = 0;
        for (Phone each : phones) {
            if (each instanceof IPhone) {
                countIphone++;
            } else if (each instanceof Samsung) {
                countSamsung++;
            }
        }
        System.out.println("countIphone = " + countIphone);
        System.out.println("countSamsung = " + countSamsung);

        System.out.println("-----------------------------------");

        for (Phone each : phones) {
            if (each instanceof IPhone || each instanceof Samsung) {
                if (each.getPrice() >= 700) {
                    System.out.println(each.getModel());
                }
            }
        }
    }
/*
  1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many IPhones in the array of phones?

	3. How many Samsung in the array of phones?

	4. Display the models of IPhones and samsung that has the price of 700 or greater


 */


}
