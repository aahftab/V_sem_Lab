package W9Q1;

public class Bus extends Vehicle {
    String color;

    Bus(double cost, String color) {
        super(cost);
        this.color = color;
    }

    public void display() {
        System.out.println("Color: " + color);
    }
    
}
