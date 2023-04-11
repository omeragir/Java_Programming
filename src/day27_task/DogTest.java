package day27_task;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1=new Dog("BullDog","Small",'F',2,"White",true);

        System.out.println(dog1);

        dog1.drink();
        dog1.eat();

    }
}
