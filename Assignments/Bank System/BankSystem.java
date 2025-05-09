class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor to initialize an account
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Creating an account object
        BankAccount myAccount = new BankAccount("123456", "Alice", 5000.0);

        // Performing operations
        myAccount.displayAccountInfo();
        myAccount.deposit(1500);
        myAccount.withdraw(2000);
        myAccount.displayAccountInfo();
    }
}
