import java.util.Scanner;

public class Largest {
    public static int nth(int[] arr, int n, int L)
     {
        if(n == 1) {
            return L;
        }

        int l = (int) -Math.pow(2,32);

        for(int i:arr) {
            if(i<L && i>l) {
                l = i;
            }
        }

        return nth(arr, n-1, l);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len;

        System.out.print("Enter length of the array: ");
        len = input.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the elements of Array");

        for(int i = 0; i < len; i++) {
            System.out.print("Enter Element " + (i+1) + ":");
            arr[i] = input.nextInt();
        }
        int L = arr[0];

        for(int i:arr) {
            if(i>L) {
                L = i;
            }
        }

        System.out.println(Largest.nth(arr,3,L));

        input.close();


    }
    
}
