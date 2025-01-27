import java.util.*;

public class PrintSubArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array here:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        printSubArrays(arr);
    }
    public static void printSubArrays(int [] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int end = n;
            for (int start=0; i<n; i++) {
                print(start, end, arr);
                System.out.println();
            }
            end--;
        }
    }
    public static void print(int start, int end, int[] arr) {
        int len = end-start+1;
        int ans[] = new int[len];
        int index = 0;
        for (int i=start; i<end; i++) {
            ans[index] = arr[i];
            index++;
        }
        for (int i=0; i<len; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
