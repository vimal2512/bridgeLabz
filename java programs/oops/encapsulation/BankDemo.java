class BankAccount {
    private double balance; // private = data hiding

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(5000);
        myAccount.withdraw(1500);

        System.out.println("Remaining balance: ₹" + myAccount.getBalance());
    }
}
