package com.autobotes.java.lamda.bank_Application;

public interface Bank {

    double getBalance();
    void deposit(double amount);
    void withDraw(double amount);

    static void transferFunds (Bank sender, Bank recipient, double transferAmount){
        sender.withDraw(transferAmount); // снимают деньги с нашего счёта
        recipient.deposit(transferAmount); // пополнение денег
    }
}
