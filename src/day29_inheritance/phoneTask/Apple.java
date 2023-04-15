package day29_inheritance.phoneTask;

public class Apple extends Phone {

    public void faceTime(long phoneNumber) {

        System.out.println("Please call the phone number " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("Please read the email " + email);
    }
}
