package day34_abstraction.animalTask;

public class Duck extends Animal {

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }
}
