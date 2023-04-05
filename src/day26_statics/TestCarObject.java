package day26_statics;

public class TestCarObject {
    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        System.out.println(car1);

        Car car2 = new Car("BMW", "Q4");
        System.out.println(car2);

        Car car3 = new Car("Audi", "A5", 2023);
        System.out.println(car3);

        Car car4 = new Car("VW", "Caddy", 2021, 5000);
        System.out.println(car4);

        Car car5 = new Car("VW", "Caddy", 2021, 5000, "White");
        System.out.println(car5);
    }
}
