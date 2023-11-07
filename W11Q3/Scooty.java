package W11Q3;

public interface Scooty {
    void offer();
    default void details() {
        System.out.println("This is a scooty.");
    }
}
