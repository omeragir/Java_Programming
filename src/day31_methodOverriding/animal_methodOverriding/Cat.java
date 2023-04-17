package day31_methodOverriding.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void eat(){
        System.out.println("Cat "+getName()+" is eating cat food");
    }


    public void sleep() {
        System.out.println("Cat "+getName()+" sleep 12 hours in a day");
    }
}
