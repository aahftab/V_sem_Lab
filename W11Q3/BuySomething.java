package W11Q3;

public class BuySomething implements Bike, Scooty{
    public void offer() {
        System.out.println("Offering 10% discount.");
    }
    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}
