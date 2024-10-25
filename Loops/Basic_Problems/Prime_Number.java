// Check If A Number Is Prime Or Not 
package Loops.Basic_Problems;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        // for (int i = 2; i <= n - 1; i++) { // for small Numbers
        // if (n % i == 0) {
        // isPrime = false;
        // }
        // }
        for (int i = 2; i <= Math.sqrt(n); i++) { // More Optimized Solution
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(n + " Is A Prime Number");
        } else {
            System.out.println(n + " Is Not A Prime Number");
        }
    }
}
