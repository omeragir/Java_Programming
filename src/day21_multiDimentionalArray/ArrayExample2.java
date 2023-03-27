package day21_multiDimentionalArray;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        System.out.println("-----------------------1------------------");

        for (String[] item : items) {
            System.out.println(Arrays.toString(item).replace("[", "").replace("]", "").replace(", ", "\t"));
        }

        System.out.println("---------------------2--------------------");

        for (String[] item : items) {
            String[] reverse = new String[item.length];
            int k = 0;
            for (int i = item.length - 1; i >= 0; i--) {
                reverse[k++] = item[i];

            }
            System.out.println(Arrays.toString(reverse).replace("[", "").replace(", ", "\t").replace("]", ""));
        }

        System.out.println("--------------------3------------------");

        String[] reverse2 = new String[items.length];
        int j = 0;
        for (int i = items.length - 1; i >= 0; i--, j++) {
            reverse2[j] = Arrays.toString(items[i]);
        }
        for (String s : reverse2) {
            System.out.println(s.replace("[", "").replace(", ", "\t").replace("]", ""));
        }


    }
}
/*
String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */