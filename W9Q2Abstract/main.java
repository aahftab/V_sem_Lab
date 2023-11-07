package W9Q2Abstract;

public class main {
    public static void Main(String[] args) {
        Savings s = new Savings("102", "Amzad", "Bhainswal", 250000, 5000);
        Current c = new Current("149", "Adil", "Kakrala", 45000, 20000);
        
        s.display();
        c.display();

        s.deposit(3000);
        c.deposit(26000);

        s.withdraw(5000);
        c.withdraw(20000);

        Account.SimpleInterest(5000,5,10);
    }
}
