package day27_task;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public String  batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, String batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName="Cydeo School";
        fieldOfStudy="Home Office";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

   public void printSchoolName(){
       System.out.println("School name is : "+schoolName);
   }
   public void printSecretCode(){
       System.out.println("Secret code is : "+secretCode);
   }
    public void attendClass(){
        System.out.println("Attend class criteria ");
    }
    public void study(){
        System.out.println("Everyone study a group");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
 Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
