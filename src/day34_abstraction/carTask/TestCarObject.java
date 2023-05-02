package day34_abstraction.carTask;

import utilities.Test;

public class TestCarObject {
    public static void main(String[] args) {

        //Car car1=new Car("X6","Red",2020,45000); can not creat object

        Honda honda=new Honda("Pilot","Black",2019,35000);

        Audi audi=new Audi("Q6","Silver",2020,36000);

        Tesla tesla=new Tesla("Model Y","Blue",2022,60000);

        System.out.println(honda);
        System.out.println(tesla);
        System.out.println(audi);
        System.out.println("-----------------------");

        honda.start();
        tesla.start();
        audi.start();
        System.out.println("---------------------");

        tesla.stop();
        honda.stop();
        audi.stop();

        System.out.println("----------------");
        tesla.autoPilot();
        audi.autoPark();




    }
}
