package day29_inheritance.encapsulation;

public class TestStudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Emily",22,'F','A',"MIT");
        System.out.println(student1);

        student1.setSchoolName("Harvard");
        System.out.println(student1);
    }
}
