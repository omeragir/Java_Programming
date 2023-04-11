package day27_accessModifiers;

public class TestCydeoStudentObject {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1=new CydeoStudent("Emily",22,'F');
        CydeoStudent student2=new CydeoStudent("John",25,'M');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);



    }
}
