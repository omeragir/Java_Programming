package day27_task;

public class Dog {

    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLeg;
    public static int numberOfEye;
    public static int numberOfWings;
    public boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLeg=4;
        numberOfEye=2;
        numberOfWings=0;
    }

    public void eat(){
        System.out.println("Dog eat food");
    }
    public void drink(){
        System.out.println("Dog drink water");
    }
    public void play(){
        System.out.println("Dog play ball");
    }
    public void sleep(){
        System.out.println("Dog sleep 8 hours" );
    }
    public static void specific(){
        System.out.println("Dog have "+numberOfLeg+" legs");
        System.out.println("Dog have "+numberOfEye+" eyes");
    }
    public static void bark(){
        System.out.println("Dog is bark");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                ", numberOfEye=" + numberOfEye +
                '}';
    }
}
/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()

 */