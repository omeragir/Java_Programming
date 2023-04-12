package day28_encapsulation.encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {
/*
        Employee employee1=new Employee();
       // employee1.salary=-200000;

       employee1.setSalary(55000);
        System.out.println(employee1.getSalary());

        employee1.setName("Emily");
        System.out.println(employee1.getName());

 */
        Employee employee1=new Employee("Emily",22,"SDETs",55000);
        System.out.println(employee1);

    }
}
