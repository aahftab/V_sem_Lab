package W9Q2Abstract;

public class Savings extends Account{
    double min_bal;

    Savings(String id, String name, String address, double balance, double min_bal) {
        super(id, name, address, balance);
        this.min_bal = min_bal;
    }

    public void display() {
        System.out.println("ID: " + super.id);
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Balance: " + super.balance);
        System.out.println("Minimum Balance: " + min_bal);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= min_bal) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}