package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'm', 4, "Large", "White");

        Cat cat = new Cat();
        cat.setInfo("Felicia", "Stray", 'F', 3, "Medium", "Black");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println("----------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        System.out.println("-----------------");

        dog.bark();
        //cat.bark();


        cat.meow();
        //dog.meow();

        tiger.hunt();
        //dog.hunt();
        System.out.println("-----------------");

       // System.out.println(dog.name);

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setAge(8);

        System.out.println(dog);


    }

}
