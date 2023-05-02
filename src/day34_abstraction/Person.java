package day34_abstraction;


import day34_abstraction.animalTask.Playable;

public class Person implements Playable {
    @Override
    public void playable() {
        System.out.println("People play with cat");
    }
}
