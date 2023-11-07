package W9Q1Static;

public class Account {
    String id;
    String name;
    String address;
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void SimpleInterest(double amount, double rate, int years) {
        double interest = amount * rate * years / 100;
        System.out.println("Interest: " + interest);
    }

    public static void CompoundInterest(double amount, double rate, int years) {
        double interest = amount * Math.pow(1 + rate / 100, years) - amount;
        System.out.println("Interest: " + interest);
    }
    
}
