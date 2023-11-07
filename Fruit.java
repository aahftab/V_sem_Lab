public class Fruit {
    String color;
    String taste;
    double price;

    Fruit(String color) {
        this(color, "Sweet");
    }

    Fruit(String color, String taste) {
        this(color, taste, 80);
    }

    Fruit(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
    }

}