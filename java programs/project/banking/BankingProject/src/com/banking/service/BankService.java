package com.banking.service;

import com.banking.model.Account;
import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<Integer, Account> accountMap = new HashMap<>();

    public void createAccount(int accNo, String name, double initialAmount) {
        Account acc = new Account(accNo, name, initialAmount);
        accountMap.put(accNo, acc);
        System.out.println("Account created successfully");
    }

    public void deposit(int accNo, double amount) {
        Account acc = accountMap.get(accNo);
        if(acc != null) {
            acc.deposit(amount);
            System.out.println("Deposit successful! New balance" + acc.getBalance());
        }else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accNo, double amount) {
        Account acc = accountMap.get(accNo);
        if(acc.withdraw(amount)){
            System.out.println("Withdraw successful! Remaining balance: $" + acc.getBalance());
        }
    }

    public void showAccount(int accNo) {
        Account acc = accountMap.get(accNo);

        if(acc != null) {
            System.out.println(acc);
        }else{
            System.out.println("Account not found");
        }
    }
}
