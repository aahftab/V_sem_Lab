package W9Q1;

public class main {
    public static void Main(String[] args) {
        Bus bus = new Bus(100, "Red");
        Train train = new Train(200, "Shatabdi");
        bus.cost();
        bus.display();
        train.cost();
        train.display();
    }
    
}
