package day29_inheritance.employeeTask;

public class TestEmployeeeObject {
    public static void main(String[] args) {

        Tester tester1=new Tester();
        tester1.setInfo("Emily",'F',22,"E22","SDETs",55000);

        Developers developers1=new Developers();
        developers1.setInfo("John",'M',25,"J25","Developers",65000);

        Teacher teacher1=new Teacher();
        tester1.setInfo("Muhtar",'M',35,"M35","Teacher",75000);

        System.out.println(teacher1);
        System.out.println(tester1);
        System.out.println(developers1);


    }
}
