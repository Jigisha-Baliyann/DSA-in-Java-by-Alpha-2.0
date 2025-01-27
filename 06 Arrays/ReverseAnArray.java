import java.util.*;

public class ReverseAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array here:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        System.out.println("The reversed array is:");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[]) {
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
