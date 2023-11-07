package W11Q3;

public interface Bike {
    void offer();
    default void details() {
        System.out.println("This is a bike.");
    }
}
