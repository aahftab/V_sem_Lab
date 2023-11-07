package W10Q1StaticPolimorphism;

public class Main {
    public static void minMaxAdd(int a, int b) {
        if(a<b) {
            System.out.println("Min : " + a + "\nMax : " + b);
        }
        else {
            System.out.println("Min : " + b + "\nMax : " + a);
        }
        a = a+b;
        System.out.println("Sum of " +a+ " and " +b+ " is " + a);
        System.out.println("");

    }

    public static void minMaxAdd(String a, String b) {
        if(a.compareToIgnoreCase(b) < 0) {
            System.out.println("Min : " + a + "\nMax : " + b);
        }
        else {
            System.out.println("Min : " + b + "\nMax : " + a);
        }

        System.out.println("Sum is " + a + b);
        System.out.println("");
    }

    public static void minMaxAdd(double a, double b) {
        if(a<b) {
            System.out.println("Min : " + a + "\nMax : " + b);
        }
        else {
            System.out.println("Min : " + b + "\nMax : " + a);
        }
        a = a+b;
        System.out.println("Sum of " +a+ " and " +b+ " is " + a);
        System.out.println("");            
    }


    public static void main(String[] args) {
        minMaxAdd(5, 10);
        minMaxAdd(5.5, 12.6);
        minMaxAdd("New ", "String");
    }
}
