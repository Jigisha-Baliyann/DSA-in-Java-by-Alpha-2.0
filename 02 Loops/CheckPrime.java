import java.util.*;

public class CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num<=0) {
            System.out.println("Warning! Enter a Natural Number only.");
        }
        else if (num==1) {
            System.out.println("1 is neither Prime nor Composite, it is a Unique Number.");
        }
        else if (num==2) {
            System.out.println("It is a PRIME Number.");
        }
        else {
            boolean isPrime = true;
            for (int i=2; i*i<=num; i++) {
                if (num%i==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.err.println("It is a PRIME Number.");
            }
            else {
                System.out.println("It is NOT a PRIME Number.");
            }
        }
    }
}
