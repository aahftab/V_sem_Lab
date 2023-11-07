package W11Q1_2;

public interface Account {
    void deposit();
    void withdraw();
    default void takeLoan() {
        System.out.println("Can't take loan.");
    }
    static void aboutBank() {
        System.out.println("This is a bank.");
    }
}
