import java.util.*;

public class FloydsTrianglePattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        int num = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}