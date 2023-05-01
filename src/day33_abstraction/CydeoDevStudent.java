package day33_abstraction;

import day32_FinalKeyword.personTask.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {

        super(name, gender, dateOfBirth);
        if (getAge()<18){
            System.err.println("Cydeo Developer student must be at 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
       if (!(batchName.equalsIgnoreCase("zero to hero")||batchName.equalsIgnoreCase("alumni dev"))){
           System.err.println("Invalid batch name "+batchName);
           System.exit(1);
       }
        this.batchName = batchName;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Batch number can not be set to zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+programmingLanguage);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id=" + id +
                ", batchNAme=" + batchName +
                ", batchNumber=" + batchNumber+
                '}';
    }
}
/*
1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */