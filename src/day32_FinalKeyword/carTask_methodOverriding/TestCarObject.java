package day32_FinalKeyword.carTask_methodOverriding;

import utilities.Test;

public class TestCarObject {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Camry", "Blue", 2020, 25000);

        Honda honda1 = new Honda("Accord", "Gray", 2019, 24000);

        Audi audi1 = new Audi("Q6", "Silver", 2021, 50000);

        Bmw bmw1 = new Bmw("X6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);


        System.out.println(tesla);
        System.out.println(toyota1);
        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println("-------------------------------------------");

        toyota1.start();
        tesla.start();
        System.out.println("--------------------");
        tesla.setPrice(25000);














    }
}
