import java.util.*;

public class PrintPairsInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array here:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        printPairs(arr);
    }
    public static void printPairs(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if (i!=j) System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
