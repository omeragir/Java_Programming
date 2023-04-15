package day29_inheritance.carTask;

public class TestCarObject {
    public static void main(String[] args) {

        Volvo volvo1=new Volvo();
        volvo1.setInfo("Japan","V40",2021,"white",25000);

        Mercedes mercedes1=new Mercedes();
        mercedes1.setInfo("Mercedes Benz","C200",2008,"Black",6600);

        System.out.println(volvo1);
        System.out.println(mercedes1);

    }
}
