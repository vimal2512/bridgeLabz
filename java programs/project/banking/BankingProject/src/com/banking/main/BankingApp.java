package com.banking.main;

import com.banking.service.BankService;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankService bank = new BankService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Banking System Menu ----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double amount = sc.nextDouble();
                    bank.createAccount(accNo, name, amount);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextDouble();
                    bank.deposit(accNo, amount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextDouble();
                    bank.withdraw(accNo, amount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    bank.showAccount(accNo);
                    break;
                case 5:
                    System.out.println("Thank you for using the Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
