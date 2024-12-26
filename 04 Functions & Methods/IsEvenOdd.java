import java.util.*;

public class IsEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        if (isEven(n))
            System.out.println("It is EVEN.");
        else
            System.out.println("It is ODD.");
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
}
