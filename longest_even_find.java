package geeks.array;
import java.util.*;

class longest_even_find {

    //Function to find the length of longest subarray of even and odd numbers.
    public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements :");
        int n = sc.nextInt();
        
        System.out.println("enter the array :");
        int arr [] = new int[n];
        for (int i =0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println(maxEvenOdd(arr, n));
    }
}

