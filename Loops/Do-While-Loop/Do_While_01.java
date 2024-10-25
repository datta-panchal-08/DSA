// Keep Entering Number Till User Enters A Multiple Of 10 Using Break Keyword

import java.util.Scanner;

public class Do_While_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.err.println("Enter Your Number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}