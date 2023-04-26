package day32_FinalKeyword.carTask_methodOverriding;

public class Bmw extends Car{

    public Bmw(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic or jump start ");
    }
}
/*
  4. BMW
                	start(): "Call the mechanic or jump start "
 */