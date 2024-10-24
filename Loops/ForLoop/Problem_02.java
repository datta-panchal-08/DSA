// Print Reverse Of A Number Using For Loop

package Loops.ForLoop;

public class Problem_02 {
    public static void main(String args[]) {
        int n = 10899;

        for (int i = n; n > 0; i--) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}