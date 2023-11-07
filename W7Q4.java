
public class W7Q4 {
    public static void main(String[] args) {
        System.out.println("\n");

        String str = "Java is awesome";
        String rev = "";

        System.out.println("Original String: " + str);

        for(int i = str.length()-1; i>=0; i--) {
            rev = rev + (str.charAt(i));
        }
        System.out.println("Reversed String: " + rev);

        System.out.println("\n");
    }
}