package day28_encapsulation.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student student=new Student();
        // student.age=-200;

        //System.out.println(student.age);

        student.setAge(22);
        System.out.println(student.getAge());
        System.out.println("Test Completed");

        student.setName("Emily");
        System.out.println(student.getName());


    }
}
