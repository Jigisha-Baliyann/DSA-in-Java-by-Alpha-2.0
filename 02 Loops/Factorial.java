import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num<0) {
            System.out.println("Wrong input! Please enter a Whole Number only.");
        }
        else {
            int fact = 1;
            while (num>=1) {
                fact *= num;
                num--;
            }
            System.out.println("The factorial = "+fact);
        }
    }
}
