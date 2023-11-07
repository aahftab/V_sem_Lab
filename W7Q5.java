import java.util.Scanner;

public class W7Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isPalindrome = true;

        System.out.print("Enter the string: ");
        String str = input.nextLine();

        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                isPalindrome = false;
            }
        }

        if(isPalindrome) {
            System.out.println("The string "+str+" is a Palindrome.");
        }
        else {
            System.out.println("The string "+str+" is not a Palindrome.");
        }

        input.close();
        
    }
}