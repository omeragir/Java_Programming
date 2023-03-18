package day17_customClass;

public class TestDogObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";

        Dog dog2 = new Dog();

        dog2.name = "Loki";
        dog2.breed = "Golden Retriever";
        dog1.gender = 'F';
        dog1.age = 2;
        dog1.size = "Small";
        dog1.color = "Orange";

        Dog dog3=new Dog();
        dog3.setInfo("Loki","Chow",'M',4,"White");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

    }


}
