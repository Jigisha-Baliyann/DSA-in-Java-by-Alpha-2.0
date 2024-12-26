import java.util.*;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        printSumOfDigits(n);
    }

    public static void printSumOfDigits(int num) {
        int copy = num, sum = 0;
        while (copy > 0) {
            int digit = copy % 10;
            sum += digit;
            copy /= 10;
        }
        System.out.println("Sum of digits = "+sum);
    }
}
