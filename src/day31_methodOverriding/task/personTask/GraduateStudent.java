package day31_methodOverriding.task.personTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        super.study();
    }
}
