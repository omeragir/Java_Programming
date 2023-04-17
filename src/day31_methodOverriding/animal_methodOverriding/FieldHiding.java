package day31_methodOverriding.animal_methodOverriding;

class A{

    int a=100;

}



public class FieldHiding extends A{

    public int a =300;// we give same name field hiding

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a);


    }

}
