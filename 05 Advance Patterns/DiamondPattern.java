import java.util.*;

public class DiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=(n-i-1); j>0; j--) {
                System.out.print("  ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=(n-1); i>=0; i--) {
            for (int j=(n-i-1); j>0; j--) {
                System.out.print("  ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
