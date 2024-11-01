package Functions;

import java.util.Scanner;

public class BasicFunction {
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String arsgs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("You Enterd : " + num1 + " " + num2);
        System.out.print("Sum Of Two Numbers Is : " + sumOfTwoNumbers(num1, num2));
    }
}
