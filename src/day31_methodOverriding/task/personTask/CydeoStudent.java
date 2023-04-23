package day31_methodOverriding.task.personTask;

public class CydeoStudent extends Student {

    private String batchNumber, groupNumber, programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, String batchNumber, String groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);

    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        if (batchNumber==null||batchNumber.isEmpty()||batchNumber.isBlank()){
            System.err.println("Invalid batch number "+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        if (programmingLanguage==null){
            programmingLanguage="Unknown";
        }
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isBlank()||programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language ");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }
}
