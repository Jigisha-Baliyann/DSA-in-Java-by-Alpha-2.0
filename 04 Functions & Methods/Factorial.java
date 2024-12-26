import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("The factorial of "+n+" is = "+fact);
    }
    public static int factorial(int num) {
        if (num==0 || num==1 ) return 1;
        int fact=1;
        for (int i=num; i>=1; i--) {
            fact *= i;
        }
        return fact;
    }
}
