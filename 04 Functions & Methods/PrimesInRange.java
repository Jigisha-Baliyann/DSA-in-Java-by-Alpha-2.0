import java.util.*;

public class PrimesInRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range number : ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range number : ");
        int upper = sc.nextInt();
        if (lower <= 0 && upper <= 0)
            System.out.println("Cannot find Prime Numbers in Negative Range!");
        else if (lower <= 0)
            printPrimesInRange(1, upper);
        else
            printPrimesInRange(lower, upper);
    }

    public static void printPrimesInRange(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        else {
            boolean flag = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                return true;
            else
                return false;
        }
    }
}
