package day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable,Huntable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle  "+getName()+" is eating snacks");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting");
    }
}
