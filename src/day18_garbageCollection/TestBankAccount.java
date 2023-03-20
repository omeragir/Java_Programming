package day18_garbageCollection;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("John", 123456789);
        System.out.println(bankAccount1);

        bankAccount1.deposit(1000);

        bankAccount1.checkBalance();

        bankAccount1.withDraw(750);

        bankAccount1.checkBalance();
    }
}
