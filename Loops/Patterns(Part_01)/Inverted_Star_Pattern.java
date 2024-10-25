// Print An Inverted Star Pattern
//    *****
//    ****
//    ***
//    **
//    *

import java.util.Scanner;

public class Inverted_Star_Pattern {
    public static void main(String args[]) {
        // My Answer
        // for (int i = 5; i >= 1; i--) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Another Logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
