package design_patterns.structural.proxy;

public interface IAccount {
    void deposit(int amount);
    void withdraw(int amount);
    int getBalance();
}
