package day29_inheritance.employeeTask;

public class Developers extends Employee {
    private String programmingLanguage;


    public void coding(){
        System.out.println(getName()+" is coding");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }



    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == "Java" || programmingLanguage == "JavaScript" || programmingLanguage == "Python" || programmingLanguage == "Ruby" || programmingLanguage == "C#" || programmingLanguage == "C++" || programmingLanguage == "Swift") {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.err.println("Invalid programming language " + programmingLanguage);
        }



    }
}
/*   #2 solution
import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee{

    private String programmingLanguage;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, String programmingLanguage) {
        setInfo(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if (!list.contains(programmingLanguage)) {
            System.err.println("Invalid programming language: "+programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }



    public void coding(){
        System.out.println(getJobTitle()+" "+getName()+" is coding in "+programmingLanguage);
    }


}
 */
