package day27_accessModifiers;

public class TestCarObject {
    public static void main(String[] args) {

        Car car1 = new Car();//Car object

        car1.new CarEngine();//CarEngine object
        Car.CarEngine car2 = car1.new CarEngine();


        new Car.StaticInnerClass();


    }


}
