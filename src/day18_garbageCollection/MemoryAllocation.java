package day18_garbageCollection;


import day17_customClass.Employee;

class Car {
    public String color;
    public String model;
    public String brand;
    public int year;


}


public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100;//stack

        Car car = new Car();
        //  Stack    Heap

        System.out.println("-----------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("John", 45, 'F', "Developer", 95000, "A12");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("-----------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;


    }

    public static void method1() {

        int b = 1000;//stack

    }

    public static void method2() {

        String c = "Hello";
        //stack      Heap(String Pool)


        String d = new String("Hello");
        //Stack               heap


    }


}
