package design_patterns.structural.proxy;

public class BankAccount implements IAccount {
    private int balance;

    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " deposited. Balance is now: " + balance);
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Balance is now: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
