// let I be the income and T be the tax then
// I < 5 lacs --> T = 0%
// 5 lacs <= I <= 10 lacs --> T = 20%
// I >= 10 lacs --> T = 30%

import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Income here: ");
        float income = sc.nextFloat();
        float tax;
        if (income<500000) {
            tax = 0; 
        }
        else if (500000 <= income && income <= 1000000) {
            tax = 20 * income / 100;
        }
        else {
            tax = 30 * income / 100;
        }
        float total = income - tax;
        System.out.println("Your tax is = "+tax);
        System.out.println("Hence, your in-hand amount is = "+total);
    }
}
