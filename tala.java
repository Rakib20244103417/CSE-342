class BankAccount {
    private int accNum;
    private String accHolderName;
    private double balance;

    // Default Constructor
    BankAccount() {
        accNum = 0;
        accHolderName = "Unknown";
        balance = 0.0;
    }

    // Constructor with Account Holder Name only
    BankAccount(String accHolderName) {
        this.accNum = 0;
        this.accHolderName = accHolderName;
        this.balance = 0.0;
    }

    // Constructor with all instance variables
    BankAccount(int accNum, String accHolderName, double balance) {
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Overloaded Deposit Method
    void deposit(double amount, String message) {
        balance += amount;
        System.out.println(message + ": " + amount + " deposited.");
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Overloaded Withdraw Method
    void withdraw(double amount, double charge) {
        double total = amount + charge;

        if (total <= balance) {
            balance -= total;
            System.out.println(amount +
                    " withdrawn with service charge " + charge);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display Method
    void display() {
        System.out.println("\nAccount Number : " + accNum);
        System.out.println("Account Holder : " + accHolderName);
        System.out.println("Balance        : " + balance);
    }
}

public class tala {
    public static void main(String[] args) {

        // Default Constructor
        BankAccount acc1 = new BankAccount();

        // Constructor with Name only
        BankAccount acc2 = new BankAccount("Rakib");

        // Constructor with all values
        BankAccount acc3 = new BankAccount(1001, "Rahman", 5000);

        acc3.display();

        acc3.deposit(2000);
        acc3.deposit(1000, "Salary");

        acc3.withdraw(1500);
        acc3.withdraw(500, 50);

        acc3.display();
    }
}