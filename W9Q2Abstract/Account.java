package W9Q2Abstract;

public abstract class Account {
    String id;
    String name;
    String address;
    double balance;

    Account(String id, String name, String address, double balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public static void SimpleInterest(double amount, double rate, int years) {
        double interest = amount * rate * years / 100;
        System.out.println("Interest: " + interest);
    }

    public static void CompoundInterest(double amount, double rate, int years) {
        double interest = amount * Math.pow(1 + rate / 100, years) - amount;
        System.out.println("Interest: " + interest);
    }
    
}
