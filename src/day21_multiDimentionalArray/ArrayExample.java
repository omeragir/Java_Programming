package day21_multiDimentionalArray;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};


        String[][] batch1Groups = {batch1Group1, batch1Group2, batch1Group3};
        System.out.println(Arrays.deepToString(batch1Groups));

        for (String[] each1 : batch1Groups) {
            for (String each : each1) {
                System.out.println(each);
            }
        }
        System.out.println("-------------------------------------------------");

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = {batch2Group1,batch2Group2,batch2Group3};
        System.out.println(Arrays.deepToString(batch2Groups));

        for (String[] each2 : batch2Groups) {
            for (String element : each2) {
                System.out.println(element);
            }
        }

        System.out.println("--------------------------------------------");

        String[][][] cydeoStudents={batch1Groups,batch2Groups};
        for (String[][] student : cydeoStudents) {
            for (String[] cydeo : student) {
                for (String element : cydeo) {
                    System.out.println(element);
                }
            }
        }
/*
CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students


 */



    }
}
