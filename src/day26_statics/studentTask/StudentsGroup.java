package day26_statics.studentTask;

import java.util.ArrayList;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student>students=new ArrayList<>();//   2.assign method

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
       // students=new ArrayList<>();//size :0
    }

    public void addStudent(Student student){  //Takes one student object ,and adds it to the arrayList of students
        students.add(student);
    }

    public void addStudent(String name,int age,char gender,String id){    //take names ,age, gender id of student info,creates object by using the giving info,then adds the student object to the arrayList
       // Student student=new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
    }
    public void removeStudent(String id){// Takes the id and then remove the student object with the specific id from the arrayList of students
        students.removeIf(p->p.id.equals(id));
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ",number of students=" + students.size() +
                '}';
    }

}
/*
 Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */