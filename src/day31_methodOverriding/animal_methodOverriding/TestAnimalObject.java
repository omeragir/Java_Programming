package day31_methodOverriding.animal_methodOverriding;

public class TestAnimalObject {
    public static void main(String[] args) {

        Cat cat=new Cat("Emily","Bengle",'F',4,"Small","White");

        Dog dog=new Dog("Max","Husky",'M',3,"Large","Black");

        Lion lion=new Lion("Simba","African Lion",'M',6,"Large","Yellow",true);

        Eagle eagle=new Eagle("Bella","American Eagle",'F',4,"Medium","Black&White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("------------------------------------");

        dog.eat();
        cat.eat();
        lion.eat();
        eagle.eat();
        System.out.println("------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();
        System.out.println("------------------------------------");



    }
}
