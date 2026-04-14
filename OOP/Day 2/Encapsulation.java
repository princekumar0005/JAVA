//Encapsulation & Access Modifiers
//This code demonstrates how to hide data using private variables and provide controlled access through Getters and Setters.


//Access Modifiers:
//private: Class level.
//default: Package level.
//protected: Package + Subclasses.
//public: Everywhere.


class BankAccount {
    // Private variable: Data Hiding
    private double balance;

    // Public method: Controlled access (Validation can be added here)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);
        System.out.println("Current Balance: " + ba.getBalance()); // Output: 200.0
    }
}

