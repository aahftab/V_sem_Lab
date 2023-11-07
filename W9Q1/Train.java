package W9Q1;

public class Train extends Vehicle{
    String name;

    Train(double cost, String name) {
        super(cost);
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
    
}
