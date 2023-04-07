package day26_statics;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
       this(name);
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
       this(name,gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name,gender,jobTitle);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, double salary) {
      this(name,jobTitle);
        this.salary = salary;
    }

    public  void printEmployeeInfo(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee gender : "+gender);
        System.out.println("Employee job title : "+jobTitle);
        System.out.println("Employee salary : "+salary);
    }

}
