package design_patterns.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        ATM atm = new ATM(bankAccount);

        atm.deposit(100);
        atm.withdraw(50);
        System.out.println("Balance at ATM: " + atm.getBalance());
        System.out.println("Balance at bank account: " + bankAccount.getBalance());
    }
}
