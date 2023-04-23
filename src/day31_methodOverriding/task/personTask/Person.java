package day31_methodOverriding.task.personTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
       setName(name);
       setAge(age);
       setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name ");
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {
            if(!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != ' '){
                System.err.println("Invalid name " + name);
                System.exit(1);
            }
        }
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='F'||gender=='M')){
            System.err.println("Invalid gender ");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(int hours){
        System.out.println(name+" is sleeping "+hours);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
