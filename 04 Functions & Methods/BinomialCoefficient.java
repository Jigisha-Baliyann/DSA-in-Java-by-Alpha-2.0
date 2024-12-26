import java.util.*;

public class BinomialCoefficient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        System.out.println("The Binomial Coefficient nCr = " + nCr(n,r) );
    }
    public static int factorial(int num) {
        if (num==0 || num==1 ) return 1;
        int fact=1;
        for (int i=num; i>=1; i--) {
            fact *= i;
        }
        return fact;
    }
    public static int nCr(int n, int r) {
        int num = factorial(n);
        int den = factorial(r) * factorial(n-r);
        int ans = num/den;
        return ans;
    }
}
