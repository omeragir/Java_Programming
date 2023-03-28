package day22_arrayList;

import utilities.ArraysUtility;

public class TestContains {
    public static void main(String[] args) {
        int[] number={10,20,30,40,50,60,70,90};

        boolean has25= ArraysUtility.contains(number,25);

        System.out.println("has25 = " + has25);

        System.out.println("----------------------------");

        String [] students={"John","Ali","Marika"};
        boolean hasMalik=ArraysUtility.contains(students,"Malik");
        System.out.println("hasMalik = " + hasMalik);

    }
}
