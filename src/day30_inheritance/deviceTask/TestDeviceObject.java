package day30_inheritance.deviceTask;

public class TestDeviceObject {
    public static void main(String[] args) {

        Computer computer=new Computer("Samsung","SAM11","Black","Large",1500,true,true);
        Desktop desktop=new Desktop("Smart","Smart11","White","Small",850,false,true);

        System.out.println(desktop);
        System.out.println(computer);

    }
}
