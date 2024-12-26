import java.util.*;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number here: ");
        int dec = sc.nextInt();
        int bin = 0;
        int copy = dec;
        int position = 0;
        while (copy>0) {
            int digit = copy%2;
            bin += digit * Math.pow(10,position);
            position++;
            copy /= 2;
        }
        System.out.println("The Binary Equivalent = "+bin);
    }
}
