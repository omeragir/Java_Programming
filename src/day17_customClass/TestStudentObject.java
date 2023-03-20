package day17_customClass;

public class TestStudentObject {

    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("Emily",'F',18,"A123",'A',true);

        Student student2=new Student();
        student2.setInfo("John",'M',19,"BA12",'D',false);

        System.out.println(student1);
        System.out.println(student2);



    }
}
