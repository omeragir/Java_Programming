package day31_methodOverriding.task.employeeTAsk;

public class Teacher extends Employee {


    public Teacher(String name, String id, String jobTitle, String companyName, int age, char gender, double salary) {
        super(name, id, jobTitle, companyName, age, gender, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }
}
