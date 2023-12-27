package design_patterns.structural.proxy;

public class ATM implements IAccount {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(int amount) {
        bankAccount.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        bankAccount.withdraw(amount);
    }

    @Override
    public int getBalance() {
        return bankAccount.getBalance();
    }
}
