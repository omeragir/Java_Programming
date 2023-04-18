package day31_methodOverriding.task.employeeTAsk;

import utilities.Test;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Tester tester=new Tester("Emily","E22","SDETs","Cydeo",22,'F',55000);

        System.out.println(tester);
        tester.work();


    }
}
