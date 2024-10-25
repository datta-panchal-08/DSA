// Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.

package Loops.Basic_Problems;

import java.util.Scanner;

public class Even_Odd_Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Stop The Program Enter 0");
        while (true) {
            System.out.println("Enter Numbers");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
            System.out.println("Sum of even integers: " + evenSum);
            System.out.println("Sum of odd integers: " + oddSum);
        }
    }
}
