package day26_statics.studentTask;

public class TestObject {
    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Emily", 18, 'F', "E18");
        Student student3 = new Student("Mehmet", 20, 'M', "B20");
        Student student4 = new Student("Sare", 19, 'F', "S19");
        Student student5 = new Student("Ece", 22, 'F', "E22");

        Student[] students = {student1, student2, student3, student4, student5};


        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);
        group1.addStudent(student1);

        group1.addStudent(student2);

        group1.addStudent("Neva", 19, 'F', "N19");

        System.out.println(group1);

        group1.removeStudent("B20");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }


        System.out.println("------------------------------------------------------");
        StudentsGroup group2 = new StudentsGroup("Java Lion", 2);

        Student student10 = new Student("Yusuf", 21, 'M', "A16");
        Student student11 = new Student("Emily", 18, 'F', "E18");
        group2.addStudent(student10);
        group2.addStudent(student11);

        StudentsGroup group3 = new StudentsGroup("Java Start", 3);

        Student student12 = new Student("Mehmet", 20, 'M', "B20");
        Student student13 = new Student("Sare", 19, 'F', "S19");

        Student[]students1={student13,student12};

        StudentsGroup group4 = new StudentsGroup("Java Meister", 4);

        Student student14 = new Student("Mehmet", 20, 'M', "B20");
        Student student15 = new Student("Sare", 19, 'F', "S19");
        Student student16 = new Student("Ece", 22, 'F', "E22");
        group4.addStudent(student14);
        group4.addStudent(student15);
        group4.addStudent(student16);

        StudentsGroup[] groups = {group1, group2, group3, group4};


    }
}
/*
Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list

 */