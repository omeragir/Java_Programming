package day33_abstraction.employeeTask;

import utilities.Test;

public class TestEmployeeObject {
    public static void main(String[] args) {
        //Employee employee=new Employee("Daniel",54,"AQ1",'M',"SDETs",55000);

        //We can not create object from an abstract class,Object must be created from a concrete class


        Teacher teacher = new Teacher("James", 45, 'M', "J45", "Math Teacher", 75000);

        Developers developers=new Developers("Daniel",25,'M',"D25","Java Developers",95000,"Java");

        Driver driver=new Driver("Aaron",22,'M',"A22","Truck Driver",90000);

        Tester tester=new Tester("Emily",21,'F',"E21","SDETs",80000);

        System.out.println(teacher);
        System.out.println(developers);
        System.out.println(driver);
        System.out.println(tester);
        System.out.println("--------------------------------");

        tester.work();
        teacher.work();
        driver.work();
        developers.work();


    }
}
