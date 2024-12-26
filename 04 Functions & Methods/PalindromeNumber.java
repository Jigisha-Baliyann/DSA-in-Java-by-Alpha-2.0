import java.util.*;

public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        if (isPalindrome(n))
            System.out.println("It is Palindrome");
        else
            System.out.println("It is NOT Palindrome.");
    }

    public static boolean isPalindrome(int num) {
        int copy = num, rev = 0;
        while (copy > 0) {
            int digit = copy % 10;
            rev = (rev * 10) + digit;
            copy /= 10;
        }
        if (num == rev)
            return true;
        else
            return false;
    }
}
