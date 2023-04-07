package day26_statics;



public class EmployeeTestObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Emily",'F',"SDETs",65000);

        System.out.println(employee1.name);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.salary);



        Employee employee2=new Employee("John",'M',"Java Developers",75000);



    }
}
