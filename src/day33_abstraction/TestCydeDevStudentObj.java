package day33_abstraction;

import java.time.LocalDate;

public class TestCydeDevStudentObj {

    public static void main(String[] args) {



        CydeoDevStudent cydeoDevStudent1=new CydeoDevStudent("Daniel",'M', LocalDate.of(1989,11,1),"A1","Alumni Dev",2);

        System.out.println(cydeoDevStudent1);

        cydeoDevStudent1.eat();
        cydeoDevStudent1.drink();
        cydeoDevStudent1.breath();
    }


}
