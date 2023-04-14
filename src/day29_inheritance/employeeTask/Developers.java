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
