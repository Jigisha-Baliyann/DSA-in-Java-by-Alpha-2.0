import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int y = sc.nextInt();
        if (y%4==0) {
            if (y%100==0) {
                if (y%400==0)
                    System.out.println("It IS a Leap Year.");
                else
                    System.out.println("It is NOT a Leap Year.");
            }
            else
                System.out.println("It IS a Leap Year.");
        }
        else
            System.out.println("It is NOT a Leap Year.");
    }
}
