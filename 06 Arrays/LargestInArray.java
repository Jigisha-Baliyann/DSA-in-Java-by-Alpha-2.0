import java.util.*;

public class LargestInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array here:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = largest(arr);
        System.out.println("The largest element in the array is = "+max);
    }
    public static int largest(int arr[]) {
        int maxElt = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > maxElt) {
                maxElt = arr[i];
            }
        }
        return maxElt;
    }
}
