import java.util.*;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number here: ");
        int bin = sc.nextInt();
        int dec = 0;
        int copy = bin;
        int position = 0;
        while (copy>0) {
            int digit = copy%10;
            dec += digit * Math.pow(2,position);
            position++;
            copy /= 10;
        }
        System.out.println("The Decimal Equivalent = "+dec);
    }
}
