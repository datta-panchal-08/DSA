package Functions.BasicProblems;

import java.util.Scanner;

public class FactorialFunc {
    public static int factorial(int num) {
        int factorial = 1;
        if (num < 1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial Of Number = " + num + " Is : " + result);
    }
}
