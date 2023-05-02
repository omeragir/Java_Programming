package day34_abstraction.deviceTask;

public abstract class Phone extends Device {


    public Phone(String brand, String model, double price, String color, char size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }


    public void call(long phoneNumber ){
       System.out.println("You call the phone number "+phoneNumber);
   }

   public void text(long phoneNumber){
       System.out.println("You send a message these phone number "+phoneNumber);
   }


    public String toString() {
        return super.toString();
    }
}

/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */