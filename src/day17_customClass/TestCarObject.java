package day17_customClass;

public class TestCarObject {
    public static void main(String[] args) {

        CarClass car1=new CarClass();

        car1.setInfo("Audi",2014,"White",22000);

        CarClass car2=new CarClass();
        car2.setInfo("BMW",2020,"Red",30_000);

        System.out.println(car1);
        System.out.println(car2);
    }
}
