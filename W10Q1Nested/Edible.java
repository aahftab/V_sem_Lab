package W10Q1Nested;

public class Edible {
    static class Fruit {
        static void fruitDetails() {
            System.out.println("This is a fruit.");
        }

        void fruitPackaging() {
            System.out.println("Fruits are packaged.");
        }
    }

    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("This is a vegetable.");
        }

        void vegetablePackaging() {
            System.out.println("Vegetables are packaged.");
        }
    }
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();

        Edible.Fruit apple = new Edible.Fruit();
        Edible.Vegetable carrot = new Edible.Vegetable();

        apple.fruitPackaging();
        carrot.vegetablePackaging();
    }
}