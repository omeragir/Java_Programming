package day38_exceptionContinue;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 32, 'M');

        System.out.println(person1);
        try {
            person1.setAge(-12);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println(person1);
    }
}
