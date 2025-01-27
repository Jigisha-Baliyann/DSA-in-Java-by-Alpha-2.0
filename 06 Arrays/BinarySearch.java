import java.util.*;

public class BinarySearch {
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
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("The element is not found in the given array!");
        }
        else {
            System.out.println("The element was found at index: "+index);
        }
    }
    public static int binarySearch( int arr[], int key) {
        int n = arr.length;
        int start = 0, end = n-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                end = mid-1;
            }
            else if (arr[mid] < key) {
                start = mid+1;
            }
        }
        return -1;
    }
}
