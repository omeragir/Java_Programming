package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Student {

    private String jobTitle;
    private String employeeId;
    private double salary;

    public Employee(String name, char gender, LocalDate dateOfBirth, char grade, String studentId, String jobTitle, String employeeId, double salary) {
        super(name, gender, dateOfBirth, grade, studentId);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
}
