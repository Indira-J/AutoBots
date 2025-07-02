package com.autobotes.java.lamda.bank_Application;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank aliiaMBank = new MBank(123456789111L,444444444);

        aliiaMBank.deposit(100000);

        Optima ulugbekOptima = new Optima(123456789122L, 555555555);

        Bank.transferFunds(aliiaMBank, ulugbekOptima, 500);
        Demir zinaidaDemir = new Demir(123333344555L, 666666666);
        System.out.println(zinaidaDemir.getBalance());

        BankBase.allBankRecords.stream().filter(n -> n.getBalance() > 100).forEach(System.out::println);

        double allSumOfBanks = BankBase.allBankRecords.stream().mapToDouble(Bank::getBalance).sum();
        System.out.println(allSumOfBanks);

    }
}
