//  Write a program to print the multiplication table of a number N, entered by the user.
package Loops.Basic_Problems;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
