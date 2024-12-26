import java.util.*;

public class EvenOddSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even=0, odd=0;
        int choice = 1;
        do {
            System.out.print("Enter a number: ");
            int input = sc.nextInt();
            if (input%2==0) {
                even += input;
            }
            else {
                odd += input;
            }
            System.out.print("Want to add more numbers(enter 1 for YES and 0 for NO)? ");
            choice = sc.nextInt();
        }
        while (choice == 1);
        System.out.println("Even numbers sum = "+even);
        System.out.println("Odd numbers sum = "+odd);
    }
}
