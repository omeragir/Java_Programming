package day34_abstraction.animalTask;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");
    }
}
