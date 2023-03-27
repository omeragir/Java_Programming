package day21_multiDimentionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Joh", "Emily"};
        String[] group2 = {"Ahmet", "Mehmet", "Meryem"};
        String[] group3 = {"Ali", "Veli", "Mahmut", "Mustafa", "Mina"};
        String[] group4 = {"Beyza", "Asya"};

        String[][] groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {

            String[] eachGroup = groups[i];

            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {

                String eachStudent = eachGroup[j];

                System.out.println(eachStudent);

            }
        }
        System.out.println("------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println("------------------------------------------------");

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup= groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }


    }
}
