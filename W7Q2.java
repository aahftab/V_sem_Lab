
public class W7Q2 {
    public static void main(String[] args) {
        System.out.println("W7Q2: Bubble Sort");
        int[] arr = {4,65,2,54,7,789,34,5498,4,43,56,73,22};
        int temp;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j<arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i:arr) {
            System.out.print(i+",");
        }
    }
}