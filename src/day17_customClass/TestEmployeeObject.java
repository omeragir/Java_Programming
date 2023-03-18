package day17_customClass;

public class TestEmployeeObject {


    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setInfo("John",45,'M',"Java Developer",60000,"A112");

        Employee employee2=new Employee();
        employee2.setInfo("Bush",32,'M',"SDET",52000,"B52");

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.work();



    }
}
