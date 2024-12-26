import java.util.*;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=0; j<=(n-i); j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
