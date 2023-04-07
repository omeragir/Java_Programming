package day26_statics;

public class CydeoStudent {

    public String name;
    public int age,id,batchNumber,groupNumber;
    public char gender,grade;

    public static String schoolName="Cydeo School";
    public static String magicWord="wooden spoon";

    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {

        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+" is attend class");
    }
    public static void printSchoolName(){
        System.out.println("School name is "+schoolName);
    }
    public static void printProLanguage(){
        System.out.println("Programming language is  "+magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProLanguage(): displays the name of programming language
					toString()
 */