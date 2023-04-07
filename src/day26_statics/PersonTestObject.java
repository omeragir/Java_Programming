package day26_statics;

public class PersonTestObject {
    public static void main(String[] args) {

        Person person1=new Person("Emily",22,'F');

        Person person2=new Person("John",35,'M');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);




    }
}
