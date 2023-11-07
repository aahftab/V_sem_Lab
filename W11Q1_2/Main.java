package W11Q1_2;

public class Main {
    public static void main(String[] args) {
        Account current = new Current();
        Account savings = new Savings();

        current.deposit();
        current.withdraw();

        savings.deposit();
        savings.withdraw();

        current.takeLoan();
        savings.takeLoan();
    }
}
