package day29_inheritance.employeeTask;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public String getName() {
        if (name==null){
            name="Unknown";
        }
        return name;
    }

    public void setName(String name) {
     if (name.isEmpty()){
         System.err.println("Invalid name");
         System.exit(1);
     }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M'||gender=='F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender "+gender);
            System.exit(1);
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative "+age);
            System.exit(1);
        }
        if (age<18||age>65){
            System.err.println("Invalid age "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Salary can not be negative "+salary);
        }
        this.salary = salary;
    }
    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
