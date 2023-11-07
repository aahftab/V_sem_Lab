package W9Q2Abstract;

public class Current extends Account {
    double maxWithdrawal_limit;

    Current(String id, String name, String address, double balance, double maxWithdrawal_limit) {
        super(id, name, address, balance);
        this.maxWithdrawal_limit = maxWithdrawal_limit;
    }

    public void display() {
        System.out.println("ID: " + super.id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
        System.out.println("Maximum Withdrawal Limit: " + maxWithdrawal_limit);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= maxWithdrawal_limit && balance >= amount) {
            balance -= amount;
        } 
        else if(amount > maxWithdrawal_limit) {
            System.out.println("Withdrawal limit exceeded");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
}
