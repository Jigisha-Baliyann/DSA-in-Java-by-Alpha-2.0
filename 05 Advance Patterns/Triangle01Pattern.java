import java.util.*;

public class Triangle01Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                if ((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
