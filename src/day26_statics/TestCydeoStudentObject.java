package day26_statics;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("Emily",22,12,4,2,'F','A');
        System.out.println(student1);

        student1.printSchoolName();
    }
}
