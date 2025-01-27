import java.util.*;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array here:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("The element is not found in the given array!");
        }
        else {
            System.out.println("The element was found at index: "+index);
        }
    }
    public static int linearSearch(int arr[], int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==key) return i;
        }
        return -1;
    }
}
