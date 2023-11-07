package W9Q1Static;

public class main {
    public static void Main(String[] args) {
        Account a = new Account();
        a.id = "102";
        a.name = "Amzad";
        a.address = "Bhainswal";
        a.balance = 250000;

        a.deposit(50000);
        a.withdraw(10000);

        

        Account.SimpleInterest(10000, 5, 2);
        Account.CompoundInterest(10000, 5, 2);
    }
    
}
