import java.util.Scanner;

public class W7Q1 {
    public static void main(String[] args) {

        boolean found = false;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int num = input.nextInt();

        int start = 0;
        int end = arr.length-1;
        int mid = -1;

        while(start<=end && !found) {
            mid = (start + end)/2;

            if(num==arr[mid]) {
                found = true;
            }
            else if(num<arr[mid]) {
                end = mid-1;
            }
            else if(num>arr[mid]) {
                start = mid+1;
            }
        }

        if(found) {
            System.out.println("Number "+num+" is found at index "+ mid);
        }
        else {
            System.out.println("Number "+num+" is not found");
        }

        input.close();
    }
}