package day32_FinalKeyword.carTask_methodOverriding;

public class Honda extends Car{


    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }
}
/*
  2. Honda
                    start(): "Press the brake and twist the key to ignition"
 */