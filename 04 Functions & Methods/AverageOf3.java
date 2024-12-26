import java.util.*;

public class AverageOf3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        System.out.print("Enter third number = ");
        int c = sc.nextInt();
        printAverage(a,b,c);
    }
    public static void printAverage(int a, int b, int c) {
        float sum = a+b+c;
        float avg = sum/3;
        System.out.println("The average is = "+avg);
    }
}
