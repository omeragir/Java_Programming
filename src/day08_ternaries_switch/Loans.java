package day08_ternaries_switch;

public class Loans {
    public static void main(String[] args) {
        double salary=130_000;
        double creditScore=600;

        String loan=(salary>=60_000&&creditScore>=650)?"Loan Approved":"Loan Denied";
        System.out.println("loan = " + loan);

    }
}
