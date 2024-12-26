import java.util.*;

public class CharacterPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
